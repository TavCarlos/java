package fundamentos.desafiosFundamentos;

public class DesafioAritmeticos {

	public static void main(String[] args) {
		
		
		//Math.pow() aplica potência retoma ponto flutuante. utilizar cast se quiser resultado inteiro. 
		
		//SuperiorA
		int NumA = (int) Math.pow(6*(3+2), 2);
		int DenA = 3 * 2;
		int SuperiorA = NumA / DenA;
		
		//SuperiorB
		int NumB = (1-5) * (2-7);
		int DenB = 2;
		int SuperiorB = (int) Math.pow( (NumB / DenB), 2);

		//Superior
		int superior = (int) Math.pow( (SuperiorA - SuperiorB), 3);

		//Final da Equação
		int inferior = (int) Math.pow(10, 3);
		int resultado = superior / inferior;
		
		System.out.printf("O Resultado é %d.", resultado);
	}
}
