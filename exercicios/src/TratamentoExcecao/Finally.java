package TratamentoExcecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		
		/*O finally sempre será chamada, seja o try executando de forma correta ou gerando alguma exceção
		 
		 Então nesse momento em que você quer forçar que algo aconteça independente se tiver erro ou não. 
		
		 Caso não tivesse o finally e o entrada.close() estivesse dentro de try, ele nunca iria fechar, pois com o erro
		 iria mudar o fluxo para o catch, deixando o scanner em aberto.
		 */
		
		
		Scanner entrada = new Scanner(System.in);
		try {
			System.out.println(7 / entrada.nextInt()); //Se der algum problema vai pular para o catch
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			entrada.close();
			
		}
	
	
		System.out.println("Fim!");
	}
}
