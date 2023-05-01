package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		
		String s = "Boa Tarde";
		
		System.out.println(s.concat("!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("BoA TaRdE"));
		
		
		String nome = "Carlos";
		String sobrenome = "Tavares";
		int idade = 25;
		double salario = 4257.25;
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario );
		//%s => substitui Strings
		//%d => números inteiros
		//%f => números flutuantes. .2 signifca quantas casas decimais terá na string final
		//%b => boolean
		
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario );
		System.out.println(frase);
		//aqui obtenho o mesmo formato, entretanto a frase está dentro de uma variável.
		
	
	}
}
