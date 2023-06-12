package br.com.empresa.calcular.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.empresa.calcular.modelo.Memoria;
import br.com.empresa.calcular.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private JLabel label; //label é o texto que ficará dentro do display.
	
	public Display() {
		Memoria.getInstance().adicionarObservador(this);
		
		setBackground(new Color(46, 49, 50));
		label = new JLabel(Memoria.getInstance().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));
		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));
		//FlowLayout é útil quando você deseja posicionar componentes em uma sequência horizontal ou verticalmente
		//nesse caso estou posicionando os compoenentes do display para a direita.
		add(label);
	}
	
	@Override
	public void valorAlterado(String novoValor) {
		label.setText(novoValor);
	}
}
