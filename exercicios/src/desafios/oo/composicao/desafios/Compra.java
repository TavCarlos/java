package desafios.oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	
	final List<Item> itens = new  ArrayList<>();
	
	
	void AdicionarItens(Item item) {
		this.itens.add(item);
	}
	
	//outra forma, criando um produto, criando um item e colocando esse item no ArrayList
	void AdicionarItens(int quantidade, String nome, double preco) {
		this.itens.add(new Item(quantidade, (new Produto(nome, preco))));
	}
	
	
	double ValorCompra() {
		double total = 0;
		for(Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
	
}
