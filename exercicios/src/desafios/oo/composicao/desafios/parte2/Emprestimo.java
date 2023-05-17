package desafios.oo.composicao.desafios.parte2;

public class Emprestimo {

	Livro livro;
	String DataEmprestimo;
	String DataDevolucao;
	
	 Emprestimo(Livro livro, String DataEmprestimo, String DataDevolucao){
		this.livro = livro;
		this.DataEmprestimo = DataEmprestimo;
		this.DataDevolucao = DataDevolucao;
	}
}
