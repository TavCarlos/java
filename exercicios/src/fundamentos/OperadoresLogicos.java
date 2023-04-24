package fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); //AND
		System.out.println(condicao1 || condicao2); //OU
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(condicao1 && !condicao2);
		
		System.out.println("");
		System.out.println("Tabela verdade E (&&)");
		//tabela verdade E
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false);//&&true
		System.out.println(false);//%%false
		
		System.out.println("");
		System.out.println("Tabela verdade OU (||)");
		//tabela verdade OU
		System.out.println(true);//||true
		System.out.println(true);//||false
		System.out.println(false || true);
		System.out.println(false || false);
	}
}
