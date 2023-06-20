package oo.desafiosOO.composicao.desafios.parte2;

//import java.util.ArrayList;
//import java.util.List;

public class Emprestimo {

	Livro livro;
	String DataEmprestimo;
	String DataDevolucao;
	
	//List<Livro> livros = new ArrayList<>();
	
	 Emprestimo(Livro livro, String DataEmprestimo, String DataDevolucao){
		this.livro = livro;
		this.DataEmprestimo = DataEmprestimo;
		this.DataDevolucao = DataDevolucao;
	}
	 
	 
}
