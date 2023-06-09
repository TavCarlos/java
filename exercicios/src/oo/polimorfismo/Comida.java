package oo.polimorfismo;

/*
 Polimorfimos dinÂmico.
 
 Criação da classe Comida na qual vai ser a classe pai de: Arroz, Feijao e Sorvete.
 Apois isso, há a criação dos getters e setters. Além da utilização dos construtores
 
 */

public abstract class Comida {
	//criando uma abstract class você não iria permitir que fosse instanciado Comida ingrediente = new Comida();
	//ou seja, não da para instanciar uma comida genérica.
	//mesmo a classe sendo abstract todos os métodos e atributos podem ser utilizados normalmente pela herança.
	
	private double peso;
	
	//utilizar o construtor padrão caso haja a necessidade de utilizar o setPeso diretamente nas Classes Arroz, Feijão e Sorvete.
	//Comida(){
	//	this(0);
	//}
	
	public Comida(double peso){
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0 && peso <= 0.5) {
			this.peso = peso;
		}
	}
	
}
