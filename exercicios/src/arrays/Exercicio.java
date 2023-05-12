package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3]; //criando array.
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		//para visualizar um array precisa passa-lo para string utilizando objeto Arrays/
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) { //enquanto valor 'i' for menor que a quantidade de elemento no array. 
			total += notasAlunoA[i];
		}
		System.out.println(total / notasAlunoA.length); //vai dividir pela quantidade de notas existentes.

		//outra forma não tão usual de inicializar um array
		double[] notasAlunoB = {6.9, 8.9, 5.5, 10};
		
		total = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			total += notasAlunoB[i];
		}
		System.out.println(total / notasAlunoB.length);
	}
}
