package br.com.empresa.app.calculo;

import br.com.empresa.app.calculo.interno.OperacoesAritmeticas;

public class Calculadora {

	
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

	public double soma(double... nums) { //delega a execução da classe OpAritmetica para a classe Claculadora.
		return opAritmeticas.soma(nums);
	}
	
}