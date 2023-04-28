package estruturaDeControle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe um número:");
		int numero = Integer.parseInt(valor);
				
		if(numero % 2 == 0) { //Se o resultado for TRUE faça:
			System.out.println("O número digitado é par!");
		} else { //Se o resultado for FALSE faça: 
			System.out.println("O número digitado é impar!");
		}
		
		
	}
}
