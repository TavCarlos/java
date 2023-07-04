package teste.consultaNamedQuery;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmesNamedQuery {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("ObterfilmesComNotaMaiorQue", "nota", 8.2);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome());
		
		
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
		
		dao.fechar();
	}
}
