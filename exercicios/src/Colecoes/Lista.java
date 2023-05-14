package Colecoes;

import java.util.List;
import java.util.ArrayList;

public class Lista {
	//Pode ser homogêneo
	//Aceita Objetos Duplicados
	//é Ordenado e INDEXADO

	public static void main(String[] args) {
		
		List<Usuario> lista = new ArrayList<>(); //Criando uma CollectionList a partir do tipo Usuario;
		
		//para adicionar um Usuario a um ArrayList basta:
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1); 
		
		//OU
		
		lista.add(new Usuario("Carlos")); //aqui estou criando um objeto ao mesmo tempo colocando-o na lista.
		lista.add(new Usuario("David"));
		lista.add(new Usuario("Jonathan"));
		lista.add(new Usuario("Fernanda"));
		lista.add(new Usuario("Letícia"));
		
		System.out.println(lista.get(4)); //Buscar o elemento a partir do seu índice.
		
		lista.remove(0); //remove pelo índice
		lista.remove(new Usuario("Fernanda")); //utilizando equals + hashocode para fazer a comparação e remove-lo.
		
		System.out.println(lista.contains(new Usuario("Letícia"))); //verificar se contém aquele usuário no Arraylist -> 
		//equals + hashcode
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
