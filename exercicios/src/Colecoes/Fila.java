package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
//Conceito de fila: Primeiro a entrar na fila será o primeiro a ser servido
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>(); //criando uma fila.
		
		
		//Offer e and -> Adicionam elementos na fila
		//Diferença é o comportamento quando a fila está cheia!
		
		fila.add("Ana"); //lançará uma exceção(problema) caso a fila esteja cheia.
		fila.offer("Bia"); //retorna TRUE se conseguiu adicionar e FALSE caso não tenha conseguido
		fila.offer("Carlos");
		fila.offer("Leticia");
		fila.offer("Gim");
		
		
		//peek e element -> Obtem o próximo elemento da fila sem remove-lo.
		//Diferença é o comportamento quando a fila está vazia.
		System.out.println(fila.peek()); //retorna null caso a fila esteja vazia
		System.out.println(fila.element()); //retorna um exceção(problema) caso a fila esteja vazia.
		
		//fila.size(); -> tamanho 
		//fila.clear(); -> limpar a fila
		//fila.isEmpty(); -> verificar se a fila esta vazia
		//fila.contains();
		
		//obtem o próximo elemento da fila removendo-o da fila.
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		//Se a fila estiver vazia .poll retornará "null"
		//se a fila estiver vazia e utilizar o .remove acontecerá a excessão(problema).
	}
}
