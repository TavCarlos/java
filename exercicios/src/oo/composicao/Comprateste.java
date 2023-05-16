package oo.composicao;

public class Comprateste {

	public static void main(String[] args) {
		//relação um para n. Uma compra pode ter muitas items e vários item tem somente uma compra.

		
		Compra compra1 = new Compra();
		compra1.cliente = "Carlos";
		//compra1.itens.add(new Item("Caneta", 20, 7.45));
		//compra1.itens.add(new Item("Borracha", 12, 3.89));
		//compra1.itens.add(new Item("Caderno", 3, 18.79));

		compra1.adicionarItem("Caneta", 20, 7.45); //passando atributos pois o método já instancia o item.
		compra1.adicionarItem("Borracha", 12, 3.89);
		compra1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println(compra1.itens.size());
		System.out.println("O total da compra é: " + compra1.obterValorTotal());
	}
}
