package oo.desafiosOO.heranca.desafios;

public class Civic extends Carro implements Esportivo, Luxo{
//implements -> uma determinada classe implementa uma interface, ou seja, uma classe vai implementar e definir todos
//métodos que foram definidor na interface.
//Com isso, a classe 'Civic' tem a obrigação de implementar os métodos da interface.
	Civic(){
		super(200); //chama o construtor padrão da classe pai
	}
	
	Civic(int velocidadeMaxima){
		super(velocidadeMaxima); //chama o construtor padrão da classe pai
	}
	
	@Override  //override é uma validação que deixa claro que estou sobreescrevendo de um método acima 
	void acelerar() {
			super.acelerar();
			super.acelerar();
			super.acelerar();
			super.acelerar();
			super.acelerar();
	    }
	
	@Override
	public void ligarTurbo() {
		setDelta(15);
	}
	
	@Override
		public void desligarTurbo() {
			setDelta(15);
		}
	
	@Override
		public void ligarAr() {
			
		}
	@Override
		public void desligarAr() {
			
		}
	
	}		

	
