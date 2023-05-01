package fundamentos;

public class Aritmeticos {

	public static void main(String[] args) {
		
		
		double x = 25.5;
		double y = 10.8;
		//A operação aritmética de números flutuantes retornará números flutuantes;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y); 

		
		int a = 8;
		int b = 3;
		//Operação aritmética de número inteiro sempre retornará números inteiros.
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.print(a/ (double) b); //Usar Cast para que um número inteiro de resultado flutuante.
		
		System.out.println(a % b); //Resto da divisão
		
		
	}
}
