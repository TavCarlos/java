package oo.encapsulamento;

public class Pessoa {
	private String nome;
	private String sobrenome;
	private int idade;
	
	/*
	 Getters and Setters ajudam a encapsular os seus dados e ter uma maior controle na hora de modificar, podendo valida-los.
	 Assim, um dado ele pode ser alterado de um estado válido para outro estado válido;
	 */
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	
	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	//retorna o mesmo tipo da vriável que eu quero ler
	public int getIdade() { //ler a variável-atributo idade
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}

	}
	
	public String getNomeCompleto() { //não preciso necessariamente de um atributo para criar um get;
		return getNome() + "" + getSobrenome();
	}
	
	public String toString() {
		return "Olá, meu nome é " + getNome()+ " e tenho " + getIdade() + " anos.";
	}
}
