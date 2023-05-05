package classe;

public class ValorVsReferencia {

	int dia;
	int mes;
	int ano;
	
	ValorVsReferencia(){
		//dia = 1; 
		//mes = 1;
		//ano = 1998;
		this(1, 1, 1998); 
		/*
		 Sempre utilizar o this() você esterá chamando um construtor e só é possível chamar o this() - método dentro de
		 outro construtor. Ou seja, dentro de um construtor você está chamando outro construtor, que no caso é o construtor de baixo.
		 
		 */
	}
	
	ValorVsReferencia(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		/*
		 this aponta para o objeto/instância atual que está sendo executada.
		 Quando há conflito de nomes: como no caso acima, no qual tanto o atributo quanto o parâmetro possuem
		 o mesmo nome, é possível utilizar o this. para falar que o primeiro dia é referente ao atributo de instância.
		  
		  Com o 'this' é possível referenciar um método do objeto.
		  
		  ATENÇÃO: 'this' é um objeto da classe, ou seja, NÃO pode ser utilizado com atributos ou métodos static.
		 */
	}
	
	String DataFormatacao() {
		return String.format("%d/%d/%d", dia,mes,ano);
	}
}
