package desafios.oo.heranca.desafios;

public class Sistema {

	public static void main(String[] args) {
		
		Carro civic = new Civic(275);
		Carro idea = new Idea(160);
		
		System.out.println("Velocidade atual Civic => " + civic.velocidadeAtual);
		System.out.println("Velocidade atual Idea => " + idea.velocidadeAtual);
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar(); //não funciona pois a velocidade máxima do civic é 275;

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
