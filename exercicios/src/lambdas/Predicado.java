package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		
		//Produto é o tipo de parâmetro que irá receber. Por conta do Predicate o retorno é boolean
		Predicate<Produto> isCaro =  prod -> (prod.preco * (1 - prod.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		
		System.out.println(isCaro.test(produto));
	}
	
	/*
	 Com o 'Predicate' você passa um valor como parâmetro e é retornado verdeiro ou falso.
	 
	 É possível utilizar para:
	 a) percorrer uma lista e pegar todos os produtos que sejam considerados 'caros';
	 b) "          "    "   "  "     "    "    "       "   são frágeis.
	 
	 etc.
	 */
}
