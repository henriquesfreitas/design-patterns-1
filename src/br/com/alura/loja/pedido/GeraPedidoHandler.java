package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;
import br.com.alura.loja.pedido.acao.EnviarEmail;
import br.com.alura.loja.pedido.acao.SalvarPedidoBancoDados;

public class GeraPedidoHandler {
	
	private List<AcaoAposGerarPedido> acaolista;	

	
	
	
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acaolista) {
		super();
		this.acaolista = acaolista;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
		Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
		
		
		acaolista.forEach(a -> a.executarAcao(pedido));
		
	}

}
