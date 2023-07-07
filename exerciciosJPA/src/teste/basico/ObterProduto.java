package teste.basico;

import java.util.List;

import infra.DAO;
import modelo.basico.Produto;

public class ObterProduto {

	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto produto: produtos) {
			System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
		}
	
		double precoTotal = produtos.stream()
				.map(p -> p.getPreco())
				.reduce (0.0, (t, p) -> t + p)
				.doubleValue();
		System.out.println("Preço total: " + precoTotal);
		
		Produto produto1 = dao.obterPorId(3);
		System.out.println(produto1.getNome());
		
		dao.fechar();
	}
}
