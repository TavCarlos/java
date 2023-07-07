package teste.muitosparamuitos;

//import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmeAtor {

	public static void main(String[] args) {
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		Filme filme = dao.obterPorId(2L); //vai me retornar o filme
		
		//List<Ator> atores = filme.getAtores(); //através do filme que pesquisei, eu vejo a lista de atores associados a ele.
		
		for(Ator ator: filme.getAtores()) {
			System.out.println(ator.getNome());
		}
	}
}
