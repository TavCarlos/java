package fundamentos;

public class ConversaoNumeroString {

	public static void main(String[] args) {
		//Convertendo número para string
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //converter para string e mostrar quantos charac tem na string.
		
		//outra forma
		int num2 = 10000;
		System.out.println(Integer.toString(num2)); //converte um valor primitivo para string chamando o tipo (Integer);
		
		
		long num3 = 500000;
		System.out.println(Long.toString(num3));
	}
}
