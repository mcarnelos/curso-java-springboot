package com.murilocarnelos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.murilocarnelos.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
