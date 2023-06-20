package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	//lista constante é uma lista que foi instânciada na memória com um endereço de memória, porém esse
	//endereço de memória não poderá ser alterado. O OBJETO PODE SER ALTERADO, somente o endereço de memória que não.
	
	Aluno(String nome){
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso){
		this.cursos.add(curso); //adiciona um curso criado na lista de cursos
		curso.alunos.add(this); // curso.alunos -> referência do List alunos dentro de Curso
		// this está se referindo a própria instância do obejto 'Aluno', ou seja, aluno1,2 ou 3. a depender do contexto.
		//nesse caso está adicionando o aluno a lista de alunos de um curso.
		//Isso estabelece uma relação bidirecional entre os objetos Curso e Aluno,
		//em que um curso pode ter vários alunos e um aluno pode estar matriculado em vários cursos.
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			} 
		}
		return null;
	}
	
	
	public String toString(){ //serve para converter um objeto para o formato String
		return nome;
	}
	
}
