package classe;

public class Produto { //classe

	/*
	 * Duas classes do mesmo exercício. 
	 * A class produto não tera o método main.
	 * A classe utilizará do método main para acessar a classe produto.
	 */
	
	//Definindo Atributos
	String nome;
	double preco;
	double desconto;


/*
 * Criei uma classe e a partir dessa classe no momento que eu chamar o construtor, no momento que eu quiser criar ou instânciar
 * novos objetos, os objetos criados terão esses 3 atributos. 
 */
	
	//criando construtor
	Produto(String nomeInicial, double precoInicial, double descontoInicial){ //criando de forma explícita com parâmetro a String nomeInicial
		nome = nomeInicial; //o atributo nome receberá o parâmetro nomeInicial 
		preco = precoInicial; 
		desconto = descontoInicial;
	}
	
	//Quando você cria um construtor, você automaticamente não pode usar mais o construtor padrão, para isso, é preciso:
	Produto(){
		
	}
	
	//Criando um Método
	double precoComDesconto(){ //não tem parâmetro pois dentro do objeto 'Produto' já tenho tudo que preciso para calc. o desconto
		
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) { //parâmetro descontoDoGerente pois não existe esse atributo.
		
		return preco * (1 - (desconto + descontoDoGerente));
	}
}