package com.example.exerciciossb.models;

import java.util.List;

public class ClienteTeste {

	private int id;
	private String nome;
	private String dataNascimento;
	private Boolean vip;
	private EnderecoTeste endereco;
	private List<DependenteTeste> dependentes;
	

	public ClienteTeste(int id, String nome, String dataNascimento, Boolean vip, EnderecoTeste endereco,
			List<DependenteTeste> dependentes) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.vip = vip;
		this.endereco = endereco;
		this.dependentes = dependentes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getVip() {
		return vip;
	}

	public void setVip(Boolean vip) {
		this.vip = vip;
	}

	public EnderecoTeste getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoTeste endereco) {
		this.endereco = endereco;
	}

	public List<DependenteTeste> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<DependenteTeste> dependentes) {
		this.dependentes = dependentes;
	}
	
}
