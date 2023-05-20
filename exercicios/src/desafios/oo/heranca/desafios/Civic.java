package desafios.oo.heranca.desafios;

public class Civic extends Carro {

	Civic(){
		super(200); //chama o construtor padrão da classe pai
	}
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima); //chama o construtor padrão da classe pai
	}
	
	@Override  //override é uma validação que deixa claro que estou sobreescrevendo de um método acima 
	void acelerar() {
			//delta += 25;
			super.acelerar();
			super.acelerar();
			super.acelerar();
			super.acelerar();
			super.acelerar();
	    }
	}		

	
