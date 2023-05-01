package estruturaDeControle;

import java.util.Scanner;

public class SwitchComBreak { //Mais utilizado

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite uma nota: ");		
		double nota = entrada.nextDouble();
		
		String conceito = "";
		
		switch((int) nota) { //switch não pega número flutuante.
		case 10: case 9: //como os dois fazem a mesma coisa, pode ser descrito desse jeito.
			conceito = "A";
			break; //Se essa operação satisfazer ele sairá do switch.
		case 8:
			conceito = "B";
			break;
		case 7:
			conceito = "C";
			break;
		case 6:
			conceito = "D";
			break;
		case 5: case 4:
			conceito = "E";
			break;
		case 3: case 2: case 1: case 0:
			conceito = "F";
		default: //todo o resto que não se encaixa nos cases acima.
			conceito = "Nota inválida";
			//uso do break é opcional
		}
		
		
		System.out.printf("Sua nota é: %.1f\nSeu conceito é: %s.", nota, conceito);
		entrada.close();
	}
}
