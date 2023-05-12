package arrays;


public class Foreach {

	public static void main(String[] args) {
		
		double[] notas = { 9.9, 8.7, 7.2, 9.4 };
		
		for(double nota: notas ) { //uma outra forma de percorrer todo o array, desdo primeiro ao último elemento.
			System.out.println(nota);
		}
	}
}
