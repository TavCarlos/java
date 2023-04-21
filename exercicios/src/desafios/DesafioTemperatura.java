package desafios;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		//variáveis
		final int AJUSTE = 32;
		final double FATOR = 5/9.0;//uma divisão de números inteiros retorna inteiros. 
		//Para o resultado não ser 0 é preciso fazer com que um deles seja decimal
		double fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		
		
		System.out.println(fahrenheit + "°F em celsius é: " + celsius + "°C");
	}
}
