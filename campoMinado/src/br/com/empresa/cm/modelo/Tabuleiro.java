package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.empresa.cm.excecao.ExplosaoException;

public class Tabuleiro {

	private int quantidadeLinhas;
	private int quantidadeColunas;
	private int	quantidadeMinas;
	
	private final List<Campo> campos = new ArrayList<>();
	
	public Tabuleiro(int quantidadeLinhas, int quantidadeColunas, int quantidadeMinas) {
		this.quantidadeLinhas = quantidadeLinhas;
		this.quantidadeColunas = quantidadeColunas;
		this.quantidadeMinas = quantidadeMinas;
		
		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream()
			.filter(campo -> campo.getLINHA() == linha && campo.getCOLUNA() == coluna)
			.findFirst()
			.ifPresent(campo -> campo.abrir());;
			
		} catch (ExplosaoException e) {
			campos.forEach(campo -> campo.setAberto(true));
			throw e;
		}
		
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
				campos.add(new Campo(linha ,coluna));
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
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("   ");
		for(int i = 0; i < quantidadeColunas; i++) {
			sb.append(" ");
			sb.append(i);
			sb.append(" ");
		}
		sb.append("\n");
		
		int i = 0;
		for(int linha = 0; linha < quantidadeLinhas; linha++ ) {
			sb.append(" ");
			sb.append(linha + "|");
			for(int coluna = 0; coluna < quantidadeColunas; coluna++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
			}
			sb.append("\n");
		}
		
		
		return sb.toString();
	}
	
}
