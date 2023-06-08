package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Tabuleiro implements CampoObservador { //Tabuleiro precisa detectar se acontecer algum evento no campo;

	
	private final int quantidadeLinhas;
	private final int quantidadeColunas;
	private final int quantidadeMinas;
	
	private final List<Campo> campos = new ArrayList<>();
	private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();
	
	
	public Tabuleiro(int quantidadeLinhas, int quantidadeColunas, int quantidadeMinas) {
		this.quantidadeLinhas = quantidadeLinhas;
		this.quantidadeColunas = quantidadeColunas;
		this.quantidadeMinas = quantidadeMinas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void paraCadaCampo(Consumer<Campo> funcao) {
		campos.forEach(funcao);
	}
	
	public void registrarObservadores(Consumer<ResultadoEvento> observador) {
		observadores.add(observador);
	}
	
	private void notificarObsevadores(boolean resultado) {
		observadores.stream().forEach(observador -> observador.accept(new ResultadoEvento(resultado)));
	}
	
	
	public void abrir(int linha, int coluna) {
			campos.parallelStream()
			.filter(campo -> campo.getLINHA() == linha && campo.getCOLUNA() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.abrir());
			
	} 
	
	private void mostrarMinas() {
		campos.stream().filter(campo -> campo.isMinado())
		.filter(campo -> !campo.isMarcado())
		.forEach(campo -> campo.setAberto(true));
		
	}
	
	
	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
			.filter(campo -> campo.getLINHA() == linha && campo.getCOLUNA() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.alternarMarcacao());
	}
	
	
	
	private void gerarCampos() {
		for(int linha = 0; linha < quantidadeLinhas; linha++) {
			for(int coluna = 0; coluna < quantidadeColunas; coluna++) {
				Campo campo = new Campo(linha, coluna);
				campo.registrarObservadores(this); //garantir que cada campo criado tenha o tabuleiro como observador
				campos.add(campo);
			}
		}
	}

	
	private void associarVizinhos() {
		for(Campo campo1: campos) {
			for(Campo campo2: campos){
				campo1.adicionarVizinho(campo2);
			}
		}
	}
	
	private void sortearMinas() {
		int minasArmadas = 0;
		Predicate<Campo> minada = campo -> campo.isMinado();
		
		do {
			
			int valorAleatorio = (int) (Math.random() * campos.size());
			campos.get(valorAleatorio).minar();
			
			minasArmadas = (int) campos.stream().filter(minada).count();
			
		} while(minasArmadas < quantidadeMinas);
		
	}
	
	
	public boolean ObjetivoAlcancado() {
		return campos.stream().allMatch(campo -> campo.objetivoAlcancado());
	}
	
	public void reiniciar() {
		campos.stream().forEach(campo -> campo.reiniciar());
		sortearMinas();
	}
	
	@Override
		public void eventoOcorreu(Campo campo, CampoEvento evento) {
			if(evento == CampoEvento.EXPLORADIR) {
				mostrarMinas();				
				notificarObsevadores(false);
			} else if(ObjetivoAlcancado()) {
				notificarObsevadores(true);
			}
		}

	public int getQuantidadeLinhas() {
		return quantidadeLinhas;
	}

	public int getQuantidadeColunas() {
		return quantidadeColunas;
	}

	
}
