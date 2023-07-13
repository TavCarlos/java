package com.example.exerciciossb.models;

public class EnderecoTeste {

	private String logradouro;
	private int numero;
	
	public EnderecoTeste(String logradouro, int numero) {
		super();
		this.logradouro = logradouro;
		this.numero = numero;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
