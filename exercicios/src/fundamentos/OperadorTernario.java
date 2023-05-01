package fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		
		double media = 7.6;
		
		String ResultadoParcial = media >= 5? "em recuperação": "reprovado";
		
		String resultadoFinal = media >= 7? "aprovado" : ResultadoParcial;
		//media é maior ou igual a 7 ? se sim "Aprovado" : se não "Reprovado".
		
		System.out.printf("O aluno está %s!", resultadoFinal);
	}
}
