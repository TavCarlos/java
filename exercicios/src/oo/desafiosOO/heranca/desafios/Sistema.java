package oo.desafiosOO.heranca.desafios;

public class Sistema {

	public static void main(String[] args) {
		
		//Carro civic = new Civic(275);
		Civic civic = new Civic(275); //para utilizar a interface eu não posso ter o civic criado de forma genérica.
		Carro idea = new Idea(160);
		
		System.out.println("Velocidade atual Civic => " + civic.velocidadeAtual);
		System.out.println("Velocidade atual Idea => " + idea.velocidadeAtual);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.ligarTurbo();
		//civic.acelerar();
		//civic.acelerar();
		//civic.acelerar();
		//civic.acelerar();
		//civic.acelerar();
		//civic.acelerar();
		//civic.acelerar(); //não funciona pois a velocidade máxima do civic é 275;

		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
		idea.acelerar();
	
		System.out.println("Velocidade atual Civic => " + civic.velocidadeAtual);
		System.out.println("Velocidade atual Idea => " + idea.velocidadeAtual);

		
	}
}
