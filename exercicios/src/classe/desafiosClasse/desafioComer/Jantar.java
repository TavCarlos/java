package classe.desafiosClasse.desafioComer;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao DesafioComer!");
		System.out.print("Digite um peso: ");
		double peso = entrada.nextDouble();
		
		Pessoa p1 = new Pessoa("Carlos", peso);
		Comida c1 = new Comida("Pizza", 0.7);
		Comida c2 = new Comida("Batata Frita", 0.6);
		Comida c3 = new Comida("Hamburguer", 0.8);
		Comida c4 = new Comida("Sorvete", 0.4);
		
		
		boolean sair = false;
		double engordar = 0;
		
		while(!sair) { 
			
			System.out.println("[1] - Comer Pizza");
			System.out.println("[2] - Comer Batata Frita");
			System.out.println("[3] - Comer Hamburguer");
			System.out.println("[4] - Tomar Sorvete");
			System.out.println("[5] - Ir à Academia");
			System.out.println("[0] - Sair");
			System.out.print("Qual ação gostaria de fazer: ");
			int valor = entrada.nextInt();
			
			if(valor < 0 || valor > 5) {
				System.out.println("Valor inválido! Tente novamente.");
			} else if(valor == 0) {
				sair = true;
				String variacaoPeso = p1.pesoInicial > p1.peso ? "emagreceu" : "engordou";
				System.out.printf("Ao todo, você %s: %.2fKg", variacaoPeso, p1.Engordou());
			} else {
				System.out.println();
				System.out.printf("Peso Inicial: %.2fKg\n", p1.pesoInicial);
				System.out.printf("Peso Anterior: %.2fKg\n", p1.peso);
				switch(valor) {
				case 5:
					engordar = p1.Academia();
					break;
				case 4:
					engordar = p1.Comer(c4);
					break;
				case 3:
					engordar = p1.Comer(c3);
					break;
				case 2:
					engordar = p1.Comer(c2);
					break;
				case 1:
					engordar =  p1.Comer(c1);
				}
				System.out.printf("Peso Atual: %.2fKg\n", engordar);
				System.out.println();
			}
			
		}
		
		entrada.close();
		
	}
}
