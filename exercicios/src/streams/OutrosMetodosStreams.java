package streams;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodosStreams {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 10);
		Aluno a3 = new Aluno("Bru", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 10);
		Aluno a7 = new Aluno("Maria", 6.9);
		Aluno a8 = new Aluno("Lury", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println); //Vasculha a lista e tira os iguais
		// precisa ter equals e hash implementado
		
		
		System.out.println("\nSkip/Limit");
		alunos.stream().distinct()
						.skip(2) //pular 2 elementos (ana e luna), começa na Bru
						.limit(2) // somente mostra 2 elementos
						.forEach(System.out::println);

		
		System.out.println("\ntakewhile"); //pegue elementos enquanto acontecer determinada ação
		alunos.stream().distinct()
						.takeWhile(aluno -> aluno.nota >= 7)
						.forEach(System.out::println);
		//não vai pegar a lury pois a 'maria' foi reprovada. ai interromper a execução no 
		//primeiro elemento que não satisfazer a condição.
		
	}
}
