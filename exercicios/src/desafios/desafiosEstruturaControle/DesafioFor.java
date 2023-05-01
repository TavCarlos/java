package desafios.desafiosEstruturaControle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 1; i <= 5; i++) {
			System.out.print(valor);
		  valor += "#";
		}
		
		
	//VERSÃO DO DESAFIO 
	//Refaça sem utilizar valores numéricos para controlar o laço.
	//Minha resposta:
		for (String v = "#"; !v.equals("######"); v += "#" ) {
			System.out.println(v);
		}
		
	}
}
