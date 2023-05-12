package arrays;

public class ExercicioForeach {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		double total = 0;
		for(double nota: notasAlunoA) {
			total += nota;
		}
		System.out.println(total / notasAlunoA.length);

		
		
		double[] notasAlunoB = new double[4];
		notasAlunoB[0] = 6.9;
		notasAlunoB[1] = 8.9;
		notasAlunoB[2] = 5.5;
		notasAlunoB[3] = 10;
		
		total = 0;
		for(double nota: notasAlunoB) {
			total += nota;
		}
		
		System.out.println(total / notasAlunoB.length);
	}
	
}
