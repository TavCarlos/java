package streams;

import java.util.function.UnaryOperator;

public  class Utilitarios {

	private Utilitarios() { //não permite a instância 
		
	}
	
	public final static UnaryOperator<String> maiusculo = n -> n.toUpperCase();
	public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
	//caso não queria utilizar lambda:
	public final static String grito(String n) {
		return n + "!!!";
	}
	
	/*Com essa classe sendo public e static eu não preciso instanciar-lo em alguma outra classe para utilizar esses métodos
	 podendo utilizar somente Utilitarios.maiusculo;
	 
	 */
}
