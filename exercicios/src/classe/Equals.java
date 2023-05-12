package classe;

public class Equals {

	public static void main(String[] args) {
		/*
		 Mesmo que o u1 será identico ao u2 pois são 2 objetos distintos na memória. Sendo assim,
		 utilizando .equals ou == dará falso pois irá comparar justamente o endereçamento desses objetos.
		 */
		
		
		Usuario u1 = new Usuario();
		u1.nome = "Carlos Tavares";
		u1.email = "carlos.tavares@ezemail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Carlos Tavares";
		u2.email = "carlos.tavares@ezemail.com";
		
		System.out.println(u1.equals(u2));
	}
	//Outra classe é a Usuario.java
}
