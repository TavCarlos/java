package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		//Para ter uma variável em JAVA é preciso: definir o: tipo, nome e valor da variável.
		
		double raio = 3.4;  //números com casas decimais
		final double PI = 3.14159; //final -> Valor não será passivel de mudança ao longo do programa.
		double area = PI * raio * raio;
		
		
		System.out.println("Área = " + area + " m².");
	}
}
