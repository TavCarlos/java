package br.com.empresa.cm.visao;

import javax.swing.JFrame;

import br.com.empresa.cm.modelo.Tabuleiro;


@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{ //como é uma herança: TelaPrincipal é um Jframe

	public TelaPrincipal() { //construtor
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 5);
		PainelTabuleiro painelTabuleiro = new PainelTabuleiro(tabuleiro);
		add(painelTabuleiro);
		
		setTitle("Campo Minado");
		setSize(690, 468);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true); //como recebo por herança, não há necessidade de instancia-lo. 
	}
	
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
	
}
