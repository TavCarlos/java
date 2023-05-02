package classe;

public class ProdutoTeste {
/*
 * Como a Classe ProdutoTeste e Produto estão no mesmo pacote, não preciso importa-la. 
 */
	public static void main(String[] args) {
		
		//new -> Palavra reservada responsável por chamar um construtor.
		//e o nome do construtor é exatamente o mesmo nome da classe.
		
		
		//criando duas instâncias(objetos) para essa classe
		//tipo(variável do tipo produto) -> nome_variável -> new -> nome do construtor.
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
		
		//utilizando o método
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.2); //com desconto do gerente. Passando o desconto como parâmetro.
		
		System.out.printf("Produto: %s\nPreço com desconto: %.2f\nProduto: "
				+ "%s\nPreço com desconto: %.1f", p1.nome,precoFinal1, p2.nome, precoFinal2 );
		
	}
}
