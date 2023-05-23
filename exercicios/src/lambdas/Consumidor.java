package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		 //Consumer -> recebe um parâmetro e não retorna nada.
		
		//Produto é o tipo de parâmetro que irá receber. Por conta do Consumer o retorno é void.
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
		//tal função não irá retornar nada, só irá imprimir no console o nome do produto;
		
		Produto produto1 = new Produto("Caneta", 12.34, 0.09);
		imprimir.accept(produto1);
		Produto produto2 = new Produto("Notebook", 2570.96, 0.14);
		Produto produto3 = new Produto("Caderno", 15.96, 0.18);
		Produto produto4 = new Produto("Borracha", 5.96, 0.15);
		Produto produto5 = new Produto("Lapis", 2.96, 0.19);
		
		
		
		List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4, produto5);
		
		produtos.forEach(imprimir);
		produtos.forEach(produto -> System.out.println(produto.preco));
		produtos.forEach(System.out::println);
	}
}
