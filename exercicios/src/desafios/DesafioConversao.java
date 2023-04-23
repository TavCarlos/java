package desafios;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o segundo salário: ");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe o Terceiro salário: ");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		//convertendo os valores para double
		
		double PrimeiroSalario = Double.parseDouble(valor1);
		double SegundoSalario = Double.parseDouble(valor2);
		double TerceiroSalario = Double.parseDouble(valor3);
		
		//somando
		double ValorSoma = PrimeiroSalario + SegundoSalario + TerceiroSalario;
		//media
		double ValorMedia = ValorSoma /3;
		
		//cansole
		System.out.printf("Primeiro salário: %.2f%nSegundo Salário: %.2f%nTerceiro Salário: %.2f%nMédia Salarial: %.2f", 
				PrimeiroSalario, SegundoSalario, TerceiroSalario, ValorMedia);
		
		entrada.close();
		
	}
}
