package br.com.empresa.cm.visao;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;


import br.com.empresa.cm.modelo.Campo;
import br.com.empresa.cm.modelo.CampoEvento;
import br.com.empresa.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
//O botaoCampo é responsável por traduzir em termos visuais tudo que acontece dentro de um campo, por isso
//ele implementar a interface CampoObservador, pois essa classe precisa ser notificada sempre que ocorrer
//algum evento na classe campo.
public class BotaoCampo extends JButton implements CampoObservador, MouseListener{

	//Em cima do campo que vai acontecer os eventos, e com isso o botão vai se adaptar de acordo com as necessidades;
	
	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCADO = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO);
		
		addMouseListener(this);
		campo.registrarObservadores(this);
	}
	
	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch(evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLORADIR:
			aplicarEstiloExplodir();
			break;
		 default:
			aplicarEstiloPadrao();
		}
	}

	private void aplicarEstiloPadrao() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createBevelBorder(0));
		setText("");
	}

	private void aplicarEstiloExplodir() {
		setBackground(BG_EXPLODIR);
		setForeground(Color.WHITE);
		setText("X");
	}

	private void aplicarEstiloMarcar() {
		setBackground(BG_MARCADO);
		setForeground(Color.BLACK);
		setText("M");
	}

	private void aplicarEstiloAbrir() {
		setBackground(BG_PADRAO);
		setBorder(BorderFactory.createLineBorder(Color.GRAY));
		
		if(campo.isMinado()) {
			setBackground(BG_EXPLODIR);
			return;
		}
		
		
		switch((int) campo.minasNaVizinhanca()) {
		case 1:
			setForeground(TEXTO_VERDE); //cor da letra
			break;
		case 2:
			setForeground(Color.BLUE);
			break;
		case 3:
			setForeground(Color.YELLOW);
			break;
		case 4:
		case 5:
		case 6:
			setForeground(Color.RED);
			break;
		default:
			setForeground(Color.PINK);
		}
		
		String valor = !campo.vizinhancaSegura() ? campo.minasNaVizinhanca() + "" : "";
		setText(valor);
	}
	
	@Override
	public void mouseClicked(MouseEvent evento) {
		if(evento.getButton() == 1) {
			campo.abrir();
		} else {
			campo.alternarMarcacao();
		}
	}
	@Override
	public void mouseEntered(MouseEvent e) {}
@Override
	public void mouseExited(MouseEvent e) {}
@Override
	public void mousePressed(MouseEvent e) {}
@Override
	public void mouseReleased(MouseEvent e) {}
}
