package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = aluno -> aluno.nota >= 7;
		Function<Aluno, Double> getNota = aluno -> aluno.nota;
		BinaryOperator<Double> somatorio = (x, y) -> (x + y); //reduce. x = acumulador, y = elemento
		
		alunos.parallelStream() //or .stream
			.filter(aprovado)
			.map(getNota) //utilizando map pois preciso só das notas e não da classe aluno inteira.
			.reduce(somatorio)
			.ifPresent(System.out::println);
			
	}
}
