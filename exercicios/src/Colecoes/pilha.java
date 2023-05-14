package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
//Last in/ Frist out -> imaginar uma pilha de livros
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		//.add e .push -> Adicionam o elemento na pilha
		//.add -> retorna true or false
		// .push -> não retorna nada, entretanto se a pilha tiver cheia ele retornará exeção
		livros.add("O Pequeno Príncipe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek()); //resultado "o hobbit" pois foi o ultimo a entrar, logo primeiro a sair.
		System.out.println(livros.element());
		
		System.out.println(livros.poll()); //remover primeiro "o hobbit".
		System.out.println(livros.remove()); //remove o "don quixote";
		System.out.println(livros.pop()); //assim como remove, exceção caso não tenha elementos na pilha
		
		
	}
}
