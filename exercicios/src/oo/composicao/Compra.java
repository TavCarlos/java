package oo.composicao;

import java.util.ArrayList;

public class Compra {
	//relação um para n. Uma compra pode ter muitas items.

	
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	
	void adicionarItem(String nome, int quantidade, double preco) { //método para já instanciar o item
		this.adicionar(new Item(nome, quantidade, preco)); //chama o método abaixo.
	}
	
	// relação bidirecional
	void adicionar(Item item) { 
		itens.add(item);
		item.compra = this; //relacionando o item com a compra.
	}
	
	double obterValorTotal() {
		double total = 0;
		for (Item Item: itens) {
			total += (Item.quantidade * Item.preco);
		}
		return total;
	}
	
}
