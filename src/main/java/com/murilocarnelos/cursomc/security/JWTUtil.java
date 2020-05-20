package com.murilocarnelos.cursomc.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;

@Component
public class JWTUtil {
	//pega o valor que esta no application.properties
	@Value("${jwt.secret}")
	private String secret;
	
	@Value("${jwt.expiration}")
	private Long expiration;
	
	//gerando o token
    public String generateToken(String username) {
    	return Jwts.builder()
    			.setSubject(username)
    			.setExpiration(new Date(System.currentTimeMillis() + expiration))
    			.signWith(io.jsonwebtoken.SignatureAlgorithm.HS512, secret.getBytes())
    			.compact();
    }
}
