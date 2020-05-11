package com.murilocarnelos.cursomc;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.murilocarnelos.cursomc.domain.Categoria;
import com.murilocarnelos.cursomc.domain.Cidade;
import com.murilocarnelos.cursomc.domain.Cliente;
import com.murilocarnelos.cursomc.domain.Endereco;
import com.murilocarnelos.cursomc.domain.Estado;
import com.murilocarnelos.cursomc.domain.ItemPedido;
import com.murilocarnelos.cursomc.domain.Pagamento;
import com.murilocarnelos.cursomc.domain.PagamentoComBoleto;
import com.murilocarnelos.cursomc.domain.PagamentoComCartao;
import com.murilocarnelos.cursomc.domain.Pedido;
import com.murilocarnelos.cursomc.domain.Produto;
import com.murilocarnelos.cursomc.domain.enums.EstadoPagamento;
import com.murilocarnelos.cursomc.domain.enums.TipoCliente;
import com.murilocarnelos.cursomc.repositories.CategoriaRepository;
import com.murilocarnelos.cursomc.repositories.CidadeRepository;
import com.murilocarnelos.cursomc.repositories.ClienteRepository;
import com.murilocarnelos.cursomc.repositories.EnderecoRepository;
import com.murilocarnelos.cursomc.repositories.EstadoRepository;
import com.murilocarnelos.cursomc.repositories.ItemPedidoRepository;
import com.murilocarnelos.cursomc.repositories.PagamentoRepository;
import com.murilocarnelos.cursomc.repositories.PedidoRepository;
import com.murilocarnelos.cursomc.repositories.ProdutoRepository;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		
	}
	
		

}
