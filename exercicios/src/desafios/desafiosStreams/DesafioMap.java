package desafios.desafiosStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Integer> print = System.out::println;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,9);
		
		Function<Integer, String> toBinary = num -> Integer.toBinaryString(num);
		UnaryOperator<String> backwords = num -> new StringBuilder(num).reverse().toString(); //revertendo os números backwards.
		Function<String, Integer> toDecimal = num -> Integer.parseInt(num, 2); //eu especifiquei a base, logo paseInt irá converter
		//para decimal automaticamente.
		
		nums.stream()
			.map(toBinary) //ou .map(Integer::toBinaryString))
			.map(backwords)
			.map(toDecimal)
			.forEach(print);
		
	}
}
