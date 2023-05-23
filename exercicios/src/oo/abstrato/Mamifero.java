package oo.abstrato;

public abstract class Mamifero extends Animal {

	/*
	 Aqui como a classe 'Mamifero' herda da Classe abstrata Animal ela precisa definir o método mover.
	Entretanto, não há necessidade de utilizar o método 'respirar' pois já foi definido.
	 */
	
	@Override
	public String mover() { 
		return "Com as patas";
		/*
		 aqui defino o método 'mover'; caso não fosse possível definir por ser uma classe muito
		genérica basta deixar o métodos abstrato. 
		 */
	}
	
	public abstract String mamar(); 
	//nesse caso não há como definir como todo mamifero mama, então o método foi abstrato
	
}
