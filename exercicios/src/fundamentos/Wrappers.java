package fundamentos;

import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {
		//Wrapper é um "pacote" que envolve o tipo primitivo tornando ela uma classe
		//Transformando em classe, é possível utilizar atributos/métodos, pois o valor passa a ser um objeto
		
		
		Scanner entrada = new Scanner(System.in);
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt(entrada.nextLine()); //int //parseInt -> Transforma ums String em Inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue()); //retorna o valor do byte primitivo que está dentro da classe Byte.
		System.out.println(s.toString()); //Transforma o valor de s em string.
		System.out.println(i * 2);
		System.out.println(l / 3);
		
		
		//float e double
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 101524.40;
		System.out.println(d);
		
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true"); //Transforma a string em boolean
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); //passando de boolean para string.
		
		
		//char
		Character c = '#';
		System.out.println(c.toString().toUpperCase());
		
		
		entrada.close();
		
	}
}
