package classe;

public class AreaCirc {

	//Atributos
	double raio;
	double pi = 3.14; //atributo do objeto
	static final double PI = 3.14; //transforma em atributo da classe
	
	//criando um construtor
	AreaCirc(double raioInicial){
		raio = raioInicial;
	}
	
	//criando método - Área da circunferência.
	double area() {
		
		return pi * Math.pow(raio, 2);
	}
	
	double area2() {
		return PI * Math.pow(raio, 2);
	}
}
