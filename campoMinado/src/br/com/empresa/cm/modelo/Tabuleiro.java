package br.com.empresa.cm.modelo;

import java.util.ArrayList;
import java.util.List;

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
	}

	private void gerarCampos() {
		
		
	}

	
	
}
