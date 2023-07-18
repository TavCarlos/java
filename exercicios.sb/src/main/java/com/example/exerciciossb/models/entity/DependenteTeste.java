package com.example.exerciciossb.models.entity;

public class DependenteTeste {

	private String nome;
	private int idade;
	
	public DependenteTeste(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}

	public int getId() {
		return idade;
	}

	public void setId(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
