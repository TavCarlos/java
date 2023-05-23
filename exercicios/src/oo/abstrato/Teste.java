package oo.abstrato;

public class Teste {

	public static void main(String[] args) {
		
		//Animal animal = new Animal(); //Animal não pode ser instanciado por ser uma classe abstrata
		//Mamifero mamifero = new Mamifero(); //Não pode ser instanciado por ser uma classe abstrata
		
		Mamifero cachorro = new Cachorro(); //pode ser instanciado por ser uma classe concreta
		System.out.println(cachorro.mover());
		System.out.println(cachorro.respirar());
		System.out.println(cachorro.mamar());
	}
}
