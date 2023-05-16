package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	//lista constante é uma lista que foi instânciada na memória com um endereço de memória, porém esse
	//endereço de memória não poderá ser alterado. O CONTEÚDO DA LIST PODE SER ALTERADO, somente o endereço de memória que não.

	Curso(String nome){
		this.nome = nome;
	}
	
	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno); //this.alunos -> referece ao arrayList
		aluno.cursos.add(this); //relação bidirecional
		//aluno -> representa um aluno expecífico que foi passado como argumento
		//aluno.cursos -> se refere à lista de cursos pertencente à instância do objeto Aluno representado pela variável aluno
		//This representa a própria instância Curso, ou seja, curso1 ou curso2 ou curso3, dependendo do contexto
		
		//essa linha estabelece que quando um aluno é adicionado a um curso, há a garantia que o curso seja
		//adicionado à lista de cursos do aluno.
		//ou seja, estou adicionando o curso1,2 ou 3 a lista de cursos de um aluno.
	}
}
