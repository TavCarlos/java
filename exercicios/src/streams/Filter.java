package streams;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Function;
//import java.util.function.Predicate;
/*
Filter irá filtrar os elementos dentro de uma collection.
Com isso, filter criará uma uma collection do mesmo tamanho ou menor da original.
Ao utilizar o filter com FunctionInterface, é OBRIGATÓRIO usar o PREDICATE, pois se 
o resultado for verdadeiro ele colocará o elemento dentro da nova collection criada.

Com o filter você evita criar um laço for, um teste if() e a criação de um novo array para adicionar o elemento no array.
 
 */
public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.8);
		Aluno a2 = new Aluno("Daniel", 5.4);
		Aluno a3 = new Aluno("Rebecca", 8.9);
		Aluno a4 = new Aluno("Maria", 9.8);
		Aluno a5 = new Aluno("Jean", 3.6);
		Aluno a6 = new Aluno("Rafael", 4.7);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
	//	Predicate<Aluno> isAprovado = aluno -> aluno.nota >= 7;
	//	Function<Aluno, String> aprovadosList = aluno -> "Parabéns, " + aluno.nome + "! Você foi aprovado(a).";
		
		alunos.stream()
			  .filter(aluno -> aluno.nota >= 7)
			  .map(aluno -> "Parabéns, " + aluno.nome + "! Você foi aprovado(a)." )
			  .forEach(System.out::println);
	}
}
