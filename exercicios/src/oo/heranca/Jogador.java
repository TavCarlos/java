package oo.heranca;

public class Jogador {
	
	static int dano;
	int vida = 100;
	int x;
	int y;
	
	Jogador(){
		this(0, 0); //se o jogafor não colocar as coordenadas por padrão irá colocar 0 , 0;
		//além de chamar o construtor abaixo
	}
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	boolean atacar(Jogador oponente) {
		
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
	
	boolean andar(Direcao direcao) { 
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
