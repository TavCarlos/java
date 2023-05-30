package br.com.empresa.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CampoTeste {

	
	private Campo campo = new Campo(3 , 3);
	
	@Test
	void testeVizinhoRealDistancia1() {
		Campo vizinho = new Campo(2, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);
	}
	
	@Test
	void testeNaoVizinho() {
		Campo vizinho = new Campo(2, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);
	}
	
}
