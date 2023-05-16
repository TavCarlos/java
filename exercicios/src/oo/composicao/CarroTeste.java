package oo.composicao;

public class CarroTeste {
	//relacionamento um para um
	//no qual há uma relação de motor para carro

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		System.out.println(carro.estaLigado());
		
		carro.ligar();
		System.out.println(carro.estaLigado());
		
		System.out.println(carro.motor.giros()); //acessando os giros do motor a partir de carros.
		
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		System.out.println(carro.motor.giros());
		
		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		
		//encapsulamento
		//carro.motor.fatorInjecao = -30;
		// O encapsulamento serve para evitar exposição desnecessário das variáveis da forma que o usuário
		//coloque um parâmetro que não pode colocar.
		
		System.out.println(carro.motor.giros());
	}
}
