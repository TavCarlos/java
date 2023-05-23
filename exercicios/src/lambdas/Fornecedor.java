package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
		//Fornecedor não recebe nenhum parâmetro mas retorna algo.
		Supplier< List<String> > umaLista = () -> Arrays.asList("Ana", "Maria", "Lury");
		
		System.out.println(umaLista.get());
	}
}
