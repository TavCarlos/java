package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		Consumer<Integer> println = System.out::println;
		
		//primeiro método de criação de stream
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		//método #2
		String[] maislangs = {"Python ", "Lisp", "Perl ", "Go\n"  };
		Stream.of(maislangs).forEach(print);
		
		//métodos #3
		Arrays.stream(maislangs).forEach(print);;
		
		//método #4
	//	Arrays.stream(maislangs, 1, 2).forEach(print);
		/*Ele vai escrever todos os elementos do indice um ao dois, sendo que não irá printar o segundo elemento.*/
		
		//método #5
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); //parallelStream faz o processamento mais rápido porém desordenado
		//logo, os dados não são processados na ordem.

		//metodo #6
		//Stream.generate(() -> "a").forEach(print);
		/*Vai gerar uma stream infinita que não tem ordenamento, e para isso dentro do generator você passa um supplier,
		 ou seja, não recebe como parâmetro nada e retora um resultado, então vai gerar de forma indefinida o valor 'a'*/
		
		//método #7
		Stream.iterate(0, n -> n + 1).forEach(println);
		//Gera uma Stream infinita, começando no 0 e o próximo elemento será 0 + 1. o valor 0 sendo passado para n na primeira vez;
		//diferente do Stream.generate, o Stream.iterate possui uma ordenação.
		
	}
}
