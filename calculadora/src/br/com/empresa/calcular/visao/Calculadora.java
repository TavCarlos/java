package br.com.empresa.calcular.visao;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {

		setSize(232,334);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		organizarLayout();
		
		setVisible(true);
	}
	

	private void organizarLayout(){
		setLayout(new BorderLayout(0,0)); //BorderLayout vai dividir a tela em norte, sul, leste, oeste e centro.
		//assim, organizando os Jpanels (layouts)
		
		Display display = new Display();
		display.setPreferredSize(new Dimension(233,60));
		add(display, BorderLayout.NORTH);
		
		
		Teclado teclado = new Teclado();
		add(teclado, BorderLayout.CENTER);
	}
	
	
	public static void main(String[] args) {
		new Calculadora();
	}
	
}
