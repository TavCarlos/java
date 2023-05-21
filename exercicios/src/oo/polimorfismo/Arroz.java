package oo.polimorfismo;

public class Arroz extends Comida{ //A classe Arroz vai herdar da classe pai.

//	private double peso;
	
	public Arroz(double peso){//construtor de Arroz
		super(peso); // ou
		//setPeso(peso); //irá mandar para o construtor da Classe pai o parâmetro peso com o método setPeso.
		/*
		 Utilizando o setPeso você chama o construtor padrão de forma implícita.
		 Entretanto é mais comum e recomendado utilizar o super() chamando o construtor de forma explícita.
		 */
	}

//	public double getPeso() {
//		return peso;
//	}

//	public void setPeso(double peso) {
//		if(peso >= 0) {
//			this.peso = peso;
//		}
//	}
	
	
}
