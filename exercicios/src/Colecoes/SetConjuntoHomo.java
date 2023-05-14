package Colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetConjuntoHomo {
	//Collections não aceitam tipos primitivos
	//Collection - Set é um conjunto no qual:
	//NÃO poderá haver itens repetidos
	//NÃO indexados
	//Apesar de poder trabalhar com conjuntos heterogenios é melhor trabalhar com itens homogeneos;
	//Um Set não respeita a ordem de inserção, logo não tem ordenação

	public static void main(String[] args) {
		
		//é possível também criar lista de classes que eu pré-defini, como de usuários.
		Set<String> listaAprovados = new HashSet<>(); //criando um SET. Ao colocar <> eu específico um tipo ao set.
		listaAprovados.add("David");
		listaAprovados.add("Carlos");
		listaAprovados.add("Maria");
		listaAprovados.add("Pedro");
		
		for(String candidatos : listaAprovados){
			System.out.println(candidatos);
		}
		//Para ordenar um Set basta fazer:
		// SortedSet<String> listaAprovados = new TreeSet<>(); -> ordenamento de maior para o menor (ordem alfabética); ou
		// SortedSet<String> listaAprovados = new LinkedHashSet<>(); -> garante a ordem de inserção.
		
		
		//SortedSet e Set são interfaces -> HashSet e TreeSet são classes que implementam as interfaces
		SortedSet<Integer> nums = new TreeSet<>();
		nums.add(1);
		nums.add(5);
		nums.add(10);
		nums.add(15);
		
		for(int num: nums) {
			System.out.println(num);
		}
		
		
	}
}
