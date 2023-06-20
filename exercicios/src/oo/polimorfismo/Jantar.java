package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		
		Comida arroz = new Arroz(0.2);
		Comida feijao = new Feijao(0.1);
		Comida sorvete = new Sorvete(0.4);
		//Comida ingrediente = new Comida(); 
		//Por comida ser uma abstract class, não é possível instancia-la e criar uma comida genérica
		//somente as que estão disponíveis.
		
		System.out.println(convidado.getPeso());
		convidado.comer(arroz);
		convidado.comer(feijao);
		convidado.comer(sorvete);
		
		System.out.println(convidado.getPeso());
		
	}
}
