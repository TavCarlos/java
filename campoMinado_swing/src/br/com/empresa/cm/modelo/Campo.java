package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;


public class Campo {

	private final int LINHA;
	private final int COLUNA;
	
	
	private boolean aberto = false;
	private boolean minado = false;
	private boolean marcado = false;
	
	private List<Campo> vizinhos = new ArrayList<>();
	private List<CampoObservador> observadores = new ArrayList<>();
//	private List<BiConsumer<Campo, CampoEvento>> observadores = new ArrayList<>();


	Campo(int linha, int coluna){
		this.LINHA = linha;
		this.COLUNA = coluna;
	}
	
	public void registrarObservadores(CampoObservador observador) { //alguma classe que implementa o CampoObservador
		observadores.add(observador);
		}

	private void notificarObservadores(CampoEvento evento) {
		observadores.stream().forEach(observador -> observador.eventoOcorreu(this, evento));
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
	
	public void alternarMarcacao() {
		if(!aberto) {
			marcado = !marcado;
			
			if(marcado) {
				notificarObservadores(CampoEvento.MARCAR);
			} else {
				notificarObservadores(CampoEvento.DESMARCAR);
			}
		}
	}
	
	
	public boolean abrir() {
		if(!aberto && !marcado) {
			if(minado) {
				notificarObservadores(CampoEvento.EXPLORADIR);
				return true;
			}
			setAberto(true);
			
			
			if(vizinhancaSegura()) {
				vizinhos.forEach(vizinho -> vizinho.abrir());
			}
			
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean vizinhancaSegura() {
		return vizinhos.stream().noneMatch(vizinho -> vizinho.minado);
	}
	
	void minar() {
			minado = true;
	}
	
	
	public boolean isMarcado() {
		return marcado;
	}
	
	
	void setAberto(boolean aberto) {
		this.aberto = aberto;
		if(aberto) {
				notificarObservadores(CampoEvento.ABRIR);
			}
}
	
	
	public boolean isAberto() {
		return aberto;
	}
	
	public boolean isFechado() {
		return !isAberto();
	}
	
	public boolean isMinado() {
		return minado;
	}

	
	public int getLINHA() {
		return LINHA;
	}

	public int getCOLUNA() {
		return COLUNA;
	}
	
	boolean objetivoAlcancado() {
		boolean desvendado = !minado && aberto;
		boolean protegido = minado && marcado;
		return desvendado || protegido;
	}
	
	public long minasNaVizinhanca() {
		return vizinhos.stream().filter(vizinho -> vizinho.minado).count();
	}
	
	void reiniciar() {
		aberto = false;
		minado = false;
		marcado = false;
		notificarObservadores(CampoEvento.REINICIAR);
	}
}
