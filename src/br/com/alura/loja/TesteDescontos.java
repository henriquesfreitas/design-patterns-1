package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.Orcamento;

public class TesteDescontos {

	public static void main(String[] args) {
		//https://refactoring.guru/design-patterns/chain-of-responsibility
		//when you have a series of type of discount but you dont know what discount its the right one
		//them you cant use "Strategy", but instead Chain of Responsibility
		//witch will call all the discounts types to verify one by one witch one will be used
		
		//https://refactoring.guru/design-patterns/template-method
		//Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass
		//but lets subclasses override specific steps of the algorithm without changing its structure.
		//used in the class Desconto method calcular
		
		//https://refactoring.guru/design-patterns/state
		//State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.
		//used in the class Orcamento method aplicarDescontoExtra
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 4);
		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(orcamento));
		
		orcamento = new Orcamento(new BigDecimal("1000"), 1);
		System.out.println(calculadora.calcular(orcamento));
	}

}
