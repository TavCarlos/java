package classe;

public class ValorVsReferenciaTeste {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor(tipo primitivo).
		
		a++;
		b--;
		System.out.println(a + " "+ b);
				
	/*
	 Criou um espaço de memória para variável 'a' com valor 2 e;
	 Criou um espaço de memória para variável 'b' com valor 2;
	 São espaços de memórias independentes. Se eu modificar o valor de 'a'
	 não irá alterar o valor de b e vice-versa;
	 */
		
		
		ValorVsReferencia data1 = new ValorVsReferencia(1,6,2022); //criando um objeto
		ValorVsReferencia data2 = data1; //atribuição por referência(objeto);
		
		data1.dia = 31;
		data2.mes = 12;
		
		System.out.println(data1.DataFormatacao());
		System.out.println(data2.DataFormatacao());
		
		/*
		 Objetos funcionam diferentes dos tipos primitivos.
		 Criou um espaço de memória com a variável 'data1' com o valor sendo o endereço de um objeto.
		 Criou um espaço de memória com a variável 'data2' com o valor sendo o mesmo objeto.
		 Com isso, se eu alterar alguma valor relacionado a atribuição do data1, ocorrerá a alteração
		 no data2, pois eles endereçam o mesmo objeto, estando ligandos um no outro.
		 */
		
		voltarDataParaValorPadrao(data1);
		
		System.out.println(data1.DataFormatacao());
		System.out.println(data2.DataFormatacao());
	}
	
	static void voltarDataParaValorPadrao(ValorVsReferencia d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1997;
		
	/*
	 Esse método é static para pertencer a classe assim como o main. É mais fácil métodos se acessarem quando fazem parte
	 da mesma classe ou objeto.
	 
	 void = método que não terá retorno;
	 () = utilizei o objeto como parâmetro.
	 */
	}
}
