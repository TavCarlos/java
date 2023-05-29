package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate(); //negegação de aprovado.
		
		//são funções terminadoras, com resultado boolean
		System.out.println(alunos.stream()
			.allMatch(aprovado)); //verifica se TODOS os alunos do List tem os 
								  //requisitos aplicados na função 'aprovado' ou seja nota >= 7;
		
		System.out.println(alunos.stream()
				.anyMatch(aprovado)); //verifica se ALGUN elemento do List tem os requisitos
									  //aplicdos na função 'aprovado'. (Pelo menos um)

		System.out.println(alunos.stream()
				.noneMatch(aprovado)); //verifica se NENHUM elemento do list tem os requisitos
									   //aplicados na função 'aprovado'.
		
		System.out.println(alunos.stream()
				.anyMatch(reprovado)); //verifica se algum aluno foi reprovado.
				//Se durante o laço 'aprovado' for false, o reprovado será verdadeiro (negate).
				//como todos são aprovados, logo nenhum foi reprovado.
		
	}
}