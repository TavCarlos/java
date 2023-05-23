package oo.abstrato;

public abstract class Animal {

	public String respirar() {
		return "Usando oxigênio";
	}
	
	public abstract String mover(); //aqui estou utilizando de forma abstrata, pois os animais eles se movem
	//de diferentem formas, logo, nesse nível de generalização é impossível padronizar a forma pelo qual
	//todos os animais vão se mover. Por isso eu crio um método abstrato que irá ser passado por herança
	// e quando houver uma classe mais específica eu posso definir como acontecerá esse 'mover';
	//Quando eu tenho um método abstrato, logo a classe também deverá ser abstrato.
}
