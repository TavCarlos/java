package estruturaDeControle;

public class Break {

	/*
	 * NÃO É COMUM A UTILIZAÇÃO
	 * Break -> serve para quebrar/desvia o fluxo atual das coisas.
	 * Pode ser utilizado com while, for, switch...
	 *Outro exemplo: procurar um item específicos com um array com diversos items
	 *ao achar o item ele pulará para fora do laço sem precisar percorrer todo o array.
	 */
	
	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
				if (i == 5) {
					break; //quando o i for igual a 5 ele irá quebrar o fluxo do for 
					//e irá pular para a linha fora do laço.
				}
		}
		System.out.println("Fim!");
	}
}
 