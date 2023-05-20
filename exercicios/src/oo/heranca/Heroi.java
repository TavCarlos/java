package oo.heranca;

public class Heroi extends Jogador { //significa que a classe Heroi vai herdar tudo da classe Jogador
	 //Ou seja, a classe heroi vai receber código de reuso a partir do mecanismo de henreça
	 
	//por isso não precisei definir métodos aqui, pois a classe filha(heroi) herdou da classe pai(jogador);
	
	
	
	Heroi(int x, int y){
		super(x, y);
	}
	
	
	//sobrescrevendo um método(comportamento)
	boolean atacar(Jogador oponente) { 
		boolean ataque1 = super.atacar(oponente);
		super.atacar(oponente); //utilizando super consegue utilizar algum método da ''superclasse''
		super.atacar(oponente); 
		return ataque1;
	}
	//com esse sobrescrever o método, quando o heroi atacar ele tirará 10+10+10 de dano, ou seja, 30;
	

}
