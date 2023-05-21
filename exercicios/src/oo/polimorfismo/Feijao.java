package oo.polimorfismo;

public class Feijao extends Comida{ //A classe Feijao vai herdar da classe pai.

	//private double peso;

	public Feijao(double peso){//construtor de Feijao
		super(peso);  //ou
		//setPeso(peso); //irá mandar para o construtor da Classe pai o parâmetro peso com o método setPeso.
		/*
		 Utilizando o setPeso você chama o construtor padrão de forma implícita.
		 Entretanto é mais comum e recomendado utilizar o super() chamando o construtor de forma explícita.
		 */
	}
	
	
	//public double getPeso() {
	//	return peso;
	//}

	//public void setPeso(double peso) {
	//	if(peso >= 0) {
	//		this.peso = peso;
	//	}
	//}
	
	
}
