package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Observador"); //é equivalente a uma janela da aplicação
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Operação padrão de fechar a aplicação para a aplicação.
		janela.setSize(600,200); //tamanho da janela
		janela.setLayout(new FlowLayout()); //deixa um layout para o botão
		janela.setLocationRelativeTo(null);//centralizar na tela do computador. pode mudar a referencia.
		
		
		JButton botao = new JButton("clicar!"); //cria um botão
		janela.add(botao); //adiciona um botão na tela
		
		botao.addActionListener(e -> System.out.println("Evento Funcionou!!")); //como 'addActionListener' é uma 
		//functional interface, sendo assim, eu posso passar um lambda.
		
		janela.setVisible(true);
	}
}
