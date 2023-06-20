package oo.desafiosOO.heranca.desafios;

public class Carro {
	
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual = 0;
	private int delta = 5;
	
	Carro(){
		this(125);
	}
	
	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar(){
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}
	
	void frear() {
		if(velocidadeAtual >= delta) {
			velocidadeAtual -= delta;
		} else {
			velocidadeAtual = 0;
		}
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
}
