package oo.heranca;

public class Monstro extends Jogador {//significa que a classe Heroi vai herdar tudo da classe Jogador
	 //Ou seja, a classe heroi vai receber código de reuso a partir do mecanismo de henreça

	//por isso não precisei definir métodos aqui, pois a classe filha(heroi) herdou da classe pai(jogador);
	
 public Monstro(){
		super(0 , 0); //chama o construtor padrão com as coordenadas 0, 0
		//também caberia o this() ao invés do super para chamar o construtor abaixo
	}
	
 public Monstro(int x , int y){
		super(x , y);
	}
	
	/*
	 Toda classe que possui herança tem um construtor padrão(implícito) chamando um construtor 
	 da classe pai. ou seja:
	 
	 Heroi(){
	 	super()
	 }
	 
	 Se não tiver o construtor padrão na classe pai ocorrerá erro, sendo necessário clia-lo ou 
	 passar como parâmetro quando a classe filho chamar o da classe pai
	 
	 Heroi(){
	 	super(x,y)
	 }
	 
	 ou
	 
	 Jogador(){
	 	this(x, y) aqui é um construtor padrão chamando um outro construtor com parâmetros de x e y;
	 }
	 
	 */
}
