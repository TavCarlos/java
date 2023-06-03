package br.com.empresa.cm;

import br.com.empresa.cm.modelo.Tabuleiro;
import br.com.empresa.cm.visao.TabuleiroTerminal;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		new TabuleiroTerminal(tabuleiro);
		
	}
}
