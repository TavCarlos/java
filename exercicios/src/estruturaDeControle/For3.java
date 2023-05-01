package estruturaDeControle;

public class For3 {

	public static void main(String[] args) {
		
		/*
		 * Escolpo -> Área na qual a variável está acessível, ou seja,
		 * a variável 'i' está dentro do Escolpo associado a variável for, 
		 * não sendo possível acessá-lá após o bloco.
		 * 
		 * Para acessar a variável 'i' fora do escolpo, basta colocar o 'int = 0;'
		 * fora do laço for.
		 */
		
		//um laço for dentro do outro
		for(int i = 0; i <= 10; i++ ) {
			for (int j = 0; j <= 10; j++) { //a cada 10 vezes executando o j ele executará 1 i
				System.out.printf("[%d %d]", i, j);
			}
			
			System.out.print("\n");
		}
		
	}
}
