package desafios.oo.composicao.desafios;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	final String nome;
	
	final List<Compra> compras = new ArrayList<>(); //estabelece relação unilateral entre Cliente e Compra
	//podendo um Cliente ter diversas compras.
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	//obterValorTotal
	double ValorCarrinho() { 
		double totalCarrinho = 0;
		for(Compra compra: compras) { //compra1 e compra2
			totalCarrinho += compra.ValorCompra(); //.valorcompra vai passar por cada item dentro de compra.
		}
		return totalCarrinho;
	}
	
}
