package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;

import br.com.empresa.cm.excecao.ExplosaoException;

public class Campo {

	private final int LINHA;
	private final int COLUNA;
	
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	
	Campo(int linha, int coluna){
		this.LINHA = linha;
		this.COLUNA = coluna;
	}
	
	boolean adicionarVizinho(Campo possivelVizinho) {
		boolean linhaDiferente = this.LINHA != possivelVizinho.LINHA;
		boolean colunaDiferente = this.COLUNA != possivelVizinho.COLUNA;
		boolean diagonal = linhaDiferente && colunaDiferente;
		
		int deltaLinha = Math.abs(this.LINHA - possivelVizinho.LINHA);
		int deltaColuna = Math.abs(this.COLUNA - possivelVizinho.COLUNA);
		int deltaGeral = deltaLinha + deltaColuna;
		
		if(deltaGeral == 1 && !diagonal) {
			vizinhos.add(possivelVizinho);
			return true;
		} else if(deltaGeral == 2 && diagonal){
			vizinhos.add(possivelVizinho);
			return true;
		} else {
			return false;
		}
		
	}
	
	void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
		}
	}
	
	boolean abrir() {
		if(!aberto && !marcado) {
			aberto = true;
			
			if(minado) {
				throw new ExplosaoException();
			}
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(vizinho -> vizinho.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.minado);
	}
	
	
}
