package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class DescontoParaOrcamentoPorValor extends Desconto {
	public DescontoParaOrcamentoPorValor(Desconto proximo) {
		super(proximo);
		// TODO Auto-generated constructor stub
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public boolean deveAplicar(Orcamento orcamento) {
		return 	orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
	}
}
