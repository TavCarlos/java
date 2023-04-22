package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {	
		//Ponto(.) é utilizado para acessar métodos(funcionalidades) de um determinado dado
		//Os tipos primitivos não tem o operador "."
		
		String s = "Bom dia X"; //String é um tipo não primitivo
		
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!");
		
		System.out.println(s);
		System.out.println("Carlos".concat("!").toUpperCase());
		
		
	}
}
