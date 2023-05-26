package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda");
		
		marcas.stream().map( marca -> marca.toUpperCase()).forEach(print);
		//marcas.stream -> peguei a stream de marcas
		//.map(marca -> marca.toUpperCase) -> Map vai criar uma nova StreamList e cada elemento(marca) irá ficar maiusculo
		//em seguida eu faço um forEach para percorrer a Stream e printo na tela.
		
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!!! ";
		//ao invés de utilizar .andthen é possível utilizar Steam para percorrer cada elemento de marcas.
		
		System.out.println("\n\nPrimeiro cenário usando composição de interfaces!");
		marcas.stream()
			  .map(Utilitarios.maiusculo) //ou 'maiusculo' caso a FunctionOperation esteja na mesma classe.
			  .map(primeiraLetra)
			  .map(Utilitarios::grito) //não preciso colocar (marca) pois com :: ela referencia por 'debaixo dos panos';
			  .forEach(print);
		
		/*Como no map eu tenho que utilizar uma função que irá modificar os dados da Stream anterior, é possível
		 	FunctionInterface. O stream original continua com os mesmod dados.
		 	
		 	Com isso eu não tenho métodos de modificadores isolados.
		 	Se eu utilizar:
		 	marcas.stream().map( marca -> marca.toUpperCase()).map(marca -> marca.toUpperCase)forEach(print);
		 	Eu terei um código rígido, não podendo reutilizar os métodos nela inserido.
		 	sendo assim, utilizando FunctionalInterface os métodos podem ser reutilizados.
		  */
		
		
		
		
	}
	
	
	
	/*Map é uma operação intermediária dentro da Stream que vai pegar a Stream original e vai criar uma outra Stream
	 com as modificações que foram expressas na função.
	 
	 Pelo map ser uma operação intermediária ela irá retornar uma Stream. O forEach é uma operação terminais, não podendo
	 ser chamada mais nada depois.
	 
	 */
}
