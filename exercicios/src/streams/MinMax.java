package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 10);
		Aluno a3 = new Aluno("Bru", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
				
		Collections.sort(alunos, Comparator.comparing(Aluno::getNome)); // Colocando um objeto em ordem alfabética
		
		//Comparator é uma Interface que irá comparar dois valores. Nesse exemplo vai comprar dois Alunos.
		//Uma função de comparação vai ordenar dentro de uma lista ou vai comprar dois objetos de acordo com critérios.
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if(aluno1.nota > aluno2.nota) return 1; //true
			if(aluno1.nota < aluno2.nota) return -1; //true
			return 0; //false
		};
		
		
		//Como há três possibilidades: maior, menor ou igual, não é possível representar com true or false.
		//Sendo necessário utilizar 1, -1, 0;
		
		System.out.println(alunos.stream().max(melhorNota).get()); //melhor nota
		System.out.println(alunos.stream().min(melhorNota).get()); //pior nota

	}
	
	
	
	/* 					
	 					SEM UTILIZAR LAMBDA
	 
		Comparator<Aluno> piorNota = new Comparator<Aluno>() {
			
			public int compare(Aluno o1, Aluno o2) {
				if(o1.nota > o2.nota) return 1;
				if(o1.nota < o2.nota) return -1;
				return 0;
			}
		};
		
	 */
}
