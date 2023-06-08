package br.com.empresa.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.empresa.cm.modelo.Tabuleiro;
/*JPanel(swing) é um agrupador(container), logo ele é um componente que agrupa outros componentes dentro dele*/
@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {

	public PainelTabuleiro(Tabuleiro tabuleiro) {
		
		setLayout(new GridLayout(tabuleiro.getQuantidadeLinhas(), tabuleiro.getQuantidadeColunas()));
		//SetLayout define como os componentes visuais serão dispostos(organizado) na tela.
		//gridLayout() -> define a organização em grade: linhas e colunas.
		
		tabuleiro.paraCadaCampo(campo -> add(new BotaoCampo(campo)));
		
		tabuleiro.registrarObservadores(evento ->{
			
			//houve um problema na ordem de execução, o invokeLater atrasada essa parte do código
			//assim, é possível atualizar a interface inteira antes de dizer se ganhou ou perdeu.
			SwingUtilities.invokeLater(() -> { 
				if(evento.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou!");
				} else {
					JOptionPane.showConfirmDialog(this, "Perdeu!");
				}
				
				tabuleiro.reiniciar();
			});
		});
	}
}
