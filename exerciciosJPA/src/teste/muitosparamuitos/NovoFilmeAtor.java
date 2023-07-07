package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		
	//	Filme filmeA = new Filme("Star Wars", 8.7);
	//	Filme filmeB = new Filme("O Fugitivo", 6.5);
		
//		Ator atorA = new Ator("Harrison Ford");
//		Ator atorB = new Ator("Carrie Fisher");
		
//		filmeA.adicionarAtores(atorA);
//		filmeA.adicionarAtores(atorB);
		
//		filmeB.adicionarAtores(atorA);
		
//		DAO<Filme> dao = new DAO<>();
//		dao.abrirTransacao()
//			.incluir(filmeA)
//			.fecharTransacao()
//			.fechar();
		
		
		Filme filmeC = new Filme("Spider-Man", 7.5);
		Ator ator = new Ator("Alukard Jordan");
		
		filmeC.adicionarAtores(ator);
		
		DAO<Filme> dao = new DAO<>();
		dao.incluirAtomico(filmeC).fechar();
		
	}
	
	/*
	 * Por que não precisou persistir o 'filmeB', 'atorA', e 'atorB' ?
	 * 
	 * Por conta justamente da cascade.
	 * 
	 * Na classe Filme temos a anotation : @ManyToMany(cascade = CascadeType.PERSIST) no atributo 'atores.
	 * Ou seja, SEMPRE que eu persistir um 'filme' ele também irá persistir automaticamente todos os
	 * atores que se encontram no atributo List<Atores> atores.
	 * 
	 * Com isso, na classe 'Ator' também temos a anotação: "@ManyToMany(mappedBy = "atores", cascade = CascadeType.PERSIST)
	 * no atributo 'filmes'
	 * Logo, sempre que um filme é persistido, automaticamente um ator é também.
	 * 
	 * 
	 * */
}
