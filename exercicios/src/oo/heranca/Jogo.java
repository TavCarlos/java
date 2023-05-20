package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		//Jogador j1 = new Monstro(); Pois o jogador j1 é um jogador e ao mesmo tempo um monstro.
		//ou
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		//Jogador j2 = new Heroi(); Pois o jogador j2 é um jogador e ao mesmo tempo um heroi.
		//ou
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("Mostro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
		
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Mostro tem =>" + monstro.vida);
		System.out.println("Heroi tem =>" + heroi.vida);
	}
}
