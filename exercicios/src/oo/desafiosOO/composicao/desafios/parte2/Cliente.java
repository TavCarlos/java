package oo.desafiosOO.composicao.desafios.parte2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class Cliente {

	 String nome;
	List<Emprestimo> emprestimo = new ArrayList<>();
	
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	 void AddLoan(String livroNome, String autorNome, String DataEmprestimo, String DataDevolucao ) {
		this.emprestimo.add(new Emprestimo( new Livro(livroNome, autorNome) , DataEmprestimo, DataDevolucao));
	}
	
	void RemoveLoan(Livro livro, String DataEmprestimo, String DataDevolucao) {
		this.emprestimo.remove(new Emprestimo(livro, DataEmprestimo, DataDevolucao));
	}
	
	long LoanDelayDays(String dataEmprestimo, String dataDevolucao) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");

		LocalDate dEmprestimo = LocalDate.parse(dataEmprestimo, formatter);
		LocalDate dDevolucao = LocalDate.parse(dataDevolucao, formatter);
		
		
		long delayDays = ChronoUnit.DAYS.between(dEmprestimo, dDevolucao);
		
		if(delayDays < 0) {
			return 0;
		}
		return delayDays; 
		
	}
}
