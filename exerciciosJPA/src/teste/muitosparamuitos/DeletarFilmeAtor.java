package teste.muitosparamuitos;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class DeletarFilmeAtor {

	public static void main(String[] args) {
		
		DAO<Ator> dao = new DAO<>(Ator.class);
		
		Ator ator = dao.obterPorId(3L);
		System.out.println(ator.getNome());
		
		List<Filme> filmes = ator.getFilmes(); //Possível colocar ator.getFilmes() direto no for();
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome());
		}
			
		dao.abrirTransacao()
			.deletar(ator)
			.fecharTransacao()
			.fechar();
	}
}
