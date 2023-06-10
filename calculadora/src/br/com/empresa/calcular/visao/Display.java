package br.com.empresa.calcular.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Display extends JPanel {

	private JLabel label; //label é o texto que ficará dentro do display.
	
	public Display() {
		setBackground(new Color(46, 49, 50));
		label = new JLabel("1234,56");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		//FlowLayout é útil quando você deseja posicionar componentes em uma sequência horizontal ou verticalmente
		//nesse caso estou posicionando os compoenentes do display para a direita.
		
		add(label);
	}
}
