package br.com.empresa.calcular.modelo;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String valor);
}
