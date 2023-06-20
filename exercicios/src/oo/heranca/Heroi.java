package oo.heranca;

public class Heroi extends Jogador { //significa que a classe Heroi vai herdar tudo da classe Jogador
	 //Ou seja, a classe heroi vai receber código de reuso a partir do mecanismo de henreça
	 
	//por isso não precisei definir métodos aqui, pois a classe filha(heroi) herdou da classe pai(jogador);
	
	
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	
	//sobrescrevendo um método(comportamento)
	public boolean atacar(Jogador oponente) { 
		boolean ataque1 = super.atacar(oponente);
		super.atacar(oponente); //utilizando super consegue utilizar algum método da ''superclasse''
		super.atacar(oponente); 
		return ataque1;
	}
	
	//com esse sobrescrever o método, quando o heroi atacar ele tirará 10+10+10 de dano, ou seja, 30;
	//Quando eu sobreescrevo um método, eu não posso diminuir o nível de visibilidade dele,
	//ou seja, nesse caso específico eu só poderia criar o método atacar publico pois o da classe pai também
	//é publico.

}
