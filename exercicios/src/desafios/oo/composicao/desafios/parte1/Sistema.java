package desafios.oo.composicao.desafios.parte1;

public class Sistema {

	public static void main(String[] args) {
		
	
		Cliente cliente = new Cliente("Carlos");
		
		//instanciando o Produto
		Produto Borracha = new Produto("Borracha", 1.30);
		Produto Lapis = new Produto("Lapis", 2.40);
		Produto Caderno = new Produto("Caderno", 18.90);
		Produto Estojo = new Produto("Estojo", 7.79);
		
		//instanciando Compra1 e o Item
		Compra compra1 = new Compra();
		Item item1 = new Item(3, Borracha);
		Item item2 = new Item(5, Lapis);
		compra1.AdicionarItens(item1); //colocando os Items dentro do List em Compra.java
		compra1.AdicionarItens(item2);
		
		compra1.AdicionarItens(1, "mochila", 25.50); //Instanciando direto
		
		//instanciando compra2 e Item
		Compra compra2 = new Compra();
		Item item3 = new Item(2, Caderno);
		Item item4 = new Item(3, Estojo);
		compra2.AdicionarItens(item3); 
		compra2.AdicionarItens(item4);
		
		//Adicionando os items nas compras do cliente.
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);

		double primeiraCompra = compra1.ValorCompra();
		double segundaCompra = compra2.ValorCompra();
		double carrinho = cliente.ValorCarrinho();
		
		System.out.printf("Valor da primeira compra: %.2f\n", primeiraCompra);
		System.out.printf("Valor da segunda compra: %.2f\n", segundaCompra);
		System.out.printf("Valor total do carrinho: %.2f", carrinho);
	}
}
