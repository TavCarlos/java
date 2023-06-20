package oo.heranca;

public class Jogador {
	
	private int vida = 100;
	private int x;
	private int y;
	
	//getters and Setters
	
	public int getVida() {
		return vida;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
	//Construtor
	protected Jogador(){
		this(0, 0); //se o jogafor não colocar as coordenadas por padrão irá colocar 0 , 0;
		//além de chamar o construtor abaixo
	}
	
	protected Jogador(int x, int y){
		setX(x);
		setY(y);
	}
	
	
	//métodos
	public boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x); //Math.abs retorna um valor positivo caso seja negativo.
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) { //podem se atacar
			oponente.vida -= 10;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean andar(Direcao direcao) { 
		switch(direcao) {
		case NORTE: //se fosse em If era necessário -> direcao.NORTE;
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}	
	
}
