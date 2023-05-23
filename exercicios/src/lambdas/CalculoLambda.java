package lambdas;

public class CalculoLambda {

	public static void main(String[] args) {

		Calculo soma = (x , y ) -> { //A interface 'Calculo' é uma interface na qual eu defini manualmente.
			return x + y;
		};
		
		System.out.println(soma.executar(2, 3));
	
	
	/*
	 A variável 'soma' é do tipo Calculo(que é uma interface);
	 A interface 'Calculo' possui um único método.
	 Como ela possui um único método, o java sabe que se você atribuir uma lambda
	 a lambda tem que bater com a quantidade de parâmetros e o tipo de retorno que existe no método em 'interface';
	 */
	
	/*
	 Com o lambda eu tiro a necessidade de criar várias Classes. 
	 */
	
	
		Calculo multiplicar = (x , y) -> x * y;  /*É possível retornar um resultado sem a necessidade de
		colocar as chaves. Não é necessário colocar um 'return' pois já existe um return associado a expressão.
		Quando não há presença de chaves eu não posso ter mais de uma sentença de código*/
	
		
		System.out.println(multiplicar.executar(2, 3));
	}
}
