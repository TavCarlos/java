package fundamentos;

public class OperadoresUnarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		//Pós-fixado
		a++; //a = a + 1;
		a--; //a = a - 1;
		
		//ou
		
		//pré-fixado
		++b; //b = b + 1;
		--b; //b = b - 1;
		
		/*
		 
		 Em relação a prescendência o ++a é realizado primeiro que a--
		 Logo: */
		System.out.println(++a == b--); //não é boa prática fazer isso.
		// vai retornar 'True' pois: a ordem de prescendência será: ++a -> igualar -> detrimir do b;
		// ou seja, 'a' vai adicionar 1, então valerá 2 -> igualar com b (que vale 2). ->  diminuir 'b' -1.
		
		System.out.println(a);
		System.out.println(b);
	}
}
