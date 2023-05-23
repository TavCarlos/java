package oo.abstrato;

public class Cachorro  extends Mamifero{

/*
 Como Cachorro é uma classe cocreta é necessário implementar todos os métodos abstratos herdados na herança ou
 se for necessário, sobrescrever os métodos com corpo(concretos).

 */
	
	@Override
	public String mover() { //sobrescrevendo o método mover. Não é obrigado a sobrescrever, pois já foi definido anteriomente
		return "Usando as 4 patas";
	}
	
	@Override
	public final String mamar() { //definindo o método mamar.
		return "Usando leite";
	}
	
	/*
	 Se na classe pai de 'Cachorro' não tivesse definido o método 'mover' eu teria que implementar ambos os métodos.
	 Ou seja, na classe concreta é necessário definir todos os métodos abstratos que foram deixados ao longo da hierarquia.
	 
	 Método final não pode ser sobrescrito nas suas subclasses
	 */
}
