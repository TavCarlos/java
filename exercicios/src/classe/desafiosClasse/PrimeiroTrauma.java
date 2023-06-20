package classe.desafiosClasse;


public class PrimeiroTrauma {

	int a = 3; //não pode mexer nessa linha
	//só pode mexer dentro do main e tem que fazer o console mostrar esse valor
	
	public static void main(String[] args) {
		
		PrimeiroTrauma teste = new PrimeiroTrauma();
		System.out.println(teste.a);
		
	/*
	 Minha linha de pensamento:
	 
	 'a' virou um atributo de instância dentro da classe.
	 logo, pensei em instânciar-lo dentro do main.
	 */
		
	/*
	 explicação do professor:
	 int a = 3; é um atributo de objeto, enquanto o main é um método de classe (static);  
	 Logo, para acessar um atributo de objeto dentro de um método de classe é preciso instancia-lo;
	 
	 Se o atributo fosse de classe (static int a = 3;) não precisaria da instância.
	 */
	}
}
