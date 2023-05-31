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
	
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
		}
	
	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
		}
	
	@Test
	void testeAlternarMarcacaoSegundaChamada(){
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
		}
	
	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}
	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testeAbrirComVizinhos(){
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1 , 1);
		
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		campo.adicionarVizinho(vizinho1);
		
		campo.abrir();
		
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isAberto());
		}
	
	
	@Test
	void testeAbrirComVizinhos2(){
		Campo vizinho1 = new Campo(2, 2);
		Campo vizinhoDoVizinho1 = new Campo(1 , 1);
		
		Campo outroVizinhoDoVizinho1 = new Campo(1, 2);
		outroVizinhoDoVizinho1.minar();
		
		campo.adicionarVizinho(vizinho1);
		vizinho1.adicionarVizinho(vizinhoDoVizinho1);
		vizinho1.adicionarVizinho(outroVizinhoDoVizinho1);
		
		campo.abrir();
		
		assertTrue(vizinho1.isAberto() && vizinhoDoVizinho1.isFechado() && outroVizinhoDoVizinho1.isFechado());
		}
	
	
	@Test
	void testeObjetivoNaoMinadoAberto() {
		Campo campo1 = new Campo(2,2);
		campo1.abrir();
		assertTrue(campo1.objetivoAlcancado());
	}
	
	@Test
	void testeObjetivoMinadoMarcado() {
		Campo campo1 = new Campo(2,2);
		campo1.minar();
		campo1.alternarMarcacao();
		assertTrue(campo1.objetivoAlcancado());
	}
	
	@Test
	void testeMinasVizinhanca() {
		Campo campo1 = new Campo(2,2);
		campo1.minar();
		Campo campo2 = new Campo(3,2);
		campo2.minar();
		Campo campo3 = new Campo(4,2);
		
		
		campo.adicionarVizinho(campo1);
		campo.adicionarVizinho(campo2);
		campo.adicionarVizinho(campo3);
		
		
		assertEquals(2, campo.minasNaVizinhanca());
	}

	
	@Test
	void TesteReiniciar() {
		Campo campo1 = new Campo(2,2);
		campo1.minar();
		Campo campo2 = new Campo(3,2);
		campo2.abrir();
		Campo campo3 = new Campo(4,2);
		campo3.alternarMarcacao();
		
		campo1.reiniciar();
		campo2.reiniciar();
		campo3.reiniciar();
		
		assertFalse(campo1.isMinado() && campo2.isAberto() && campo3.isMarcado());
		
	}
	
	
	
	
	
	
	}


