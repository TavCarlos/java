package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Carlos");
		Aluno aluno2 = new Aluno("João");
		Aluno aluno3 = new Aluno("Raissa");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Web2023");
		Curso curso3 = new Curso("React");
		
		curso1.adicionarAluno(aluno3);
		curso1.adicionarAluno(aluno1);
		
		curso2.adicionarAluno(aluno2);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso1.alunos) { //arraylist alunos dentro de Curso
			System.out.println("Curso1: " + aluno.nome);
		}
		
		for(Aluno aluno: curso2.alunos) {
			System.out.println("Curso2: "+ aluno.nome);
		}
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Curso3: " + aluno.nome);
		}
		
		for(Curso curso: aluno1.cursos) {
			System.out.println("aluno1 está matriculado em: " + curso.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos); //todos os alunos matriculados no primeiro curso que o aluno1 está
		//matriculado.
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("React");
		if(cursoEncontrado != null){
			System.out.println(cursoEncontrado.alunos);
		}
	}
}
