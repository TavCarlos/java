package teste.muitosparamuitos;

import java.util.ArrayList;
import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class AtualizarFilmeAtor {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		Filme filme = dao.obterPorId(1L);
		
		List<Ator> atores = new ArrayList<>(filme.getAtores());
		
			for(Ator ator: atores) {
				if(ator.getId().equals(1L)) {
					dao.abrirTransacao();
					ator.setNome("David Tavares");
					dao.merge(filme)
					.fecharTransacao()
					.fechar();
				}
			}		
	}
}

/*
 * Eu estava tentando atualizar o banco de dados utilizando "List<Ator> atores = filme.getAtores();"
 * Ao invés de "List<Ator> atores = new ArrayList<>(filme.getAtores());". Porém estava dando
 * 'ConcurrentModificationException' -> ocorre quando você quer mudar a estrutura de uma coleção ao mesmo tempo
 * que essa coleção está sendo percorrida.
 * 
 * Para solucionar fiz: "List<Ator> atores = new ArrayList<>(filme.getAtores());"
 * Com isso, ao passar filme.getAltores(); como parâmetro, eu estou criando uma ArrayList com os mesmo
 * elemento da lista original(que se encontra em filme.java). Com isso eu consigo iterar(percorrer) a coleção 'cópia'
 * enquanto eu mudo a lista original.
 *  
 * 
 * */
