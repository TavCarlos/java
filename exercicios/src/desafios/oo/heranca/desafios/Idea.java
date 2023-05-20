package desafios.oo.heranca.desafios;

public class Idea extends Carro{

	Idea(){
		this(200);
		//ou
		//super(200); //chama o construtor padrão da classe pai
	}
	Idea(int velocidadeMaxima){
		super(velocidadeMaxima); //chama o construtor padrão da classe pai
	}
	
	@Override
	void acelerar() {
		//delta += 20;
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}
}
