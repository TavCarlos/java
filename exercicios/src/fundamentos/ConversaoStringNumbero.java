package fundamentos;

import javax.swing.JOptionPane; //aparece uma tela, ao invés de utilizar o terminal

public class ConversaoStringNumbero {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1); //converte String para double
		int num2 = Integer.parseInt(valor2); //converte String para inteiro
		
		System.out.println(num1+num2);
	}
}
