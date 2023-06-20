package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		//Jogador j1 = new Monstro(); Pois o jogador j1 é um jogador e ao mesmo tempo um monstro.
		//ou
		Monstro monstro = new Monstro();
		monstro.setX(10);
		monstro.setY(10);
		
		//Jogador j2 = new Heroi(); Pois o jogador j2 é um jogador e ao mesmo tempo um heroi.
		//ou
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Mostro tem =>" + monstro.getVida());
		System.out.println("Heroi tem =>" + heroi.getVida());
		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Mostro tem =>" + monstro.getVida());
		System.out.println("Heroi tem =>" + heroi.getVida());
	}
}
