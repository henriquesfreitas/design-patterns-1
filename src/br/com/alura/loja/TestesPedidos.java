package br.com.alura.loja;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedidoBancoDados;

public class TestesPedidos {

	public static void main(String[] args) {
		//https://refactoring.guru/design-patterns/command
		//Command is a behavioral design pattern that turns a request into a stand-alone object that contains all information about the request.
		//This transformation lets you pass requests as a method arguments, delay or queue a request’s execution, and support undoable operations.
		GeraPedido geraPedido = new GeraPedido("meu deus", new BigDecimal("100"), 4);
		GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
				Arrays.asList(
						new SalvarPedidoBancoDados(),
						new EnviarEmail()
						));
		geraPedidoHandler.execute(geraPedido);
	}

}
