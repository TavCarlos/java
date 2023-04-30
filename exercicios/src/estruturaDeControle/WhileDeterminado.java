package estruturaDeControle;

public class WhileDeterminado { //sabe quantas vezes você quer repetir essa ação. Por isso determinado

	public static void main(String[] args) {
		
		int contador = 1;//variável contador -> Ela controla a quantidade de repetições do while
		
		while (contador <= 10) { //expressão que obrigatoriamente retorna TRUE(repetição) or FALSE(não-repete)
			System.out.printf("i = %d%n", contador);
			contador++; //precisa para o contador adicionar +1, sem ele ficaria em laço infinito.
		}
		
		System.out.println("o contador está em: "+ contador); //o contador sempre vai estar +1 do que você quer que pare o while
	}
	
}
 