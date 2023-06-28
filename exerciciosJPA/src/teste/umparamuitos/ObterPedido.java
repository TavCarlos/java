package teste.umparamuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {

	public static void main(String[] args) {

		DAO<Pedido> dao = new DAO<>(Pedido.class); 
		
		Pedido pedido = dao.obterPorId(1L);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getQuantidade());
			System.out.println(item.getProduto().getNome());
		}
		
		/*Com o relacionamento bilateral é possível que através de ItemPedido seja possível
		 * encontrar o Pedido e através do Pedido encontrar o ItemPedido. */	
	}
	/*
	 * Quando há uma relação ...ToMany(Como em Pedido-ItemPedido -> OneToMnay) o JPA tende a fazer
	 * fetch LAZY, sendo necessário fazer duas consultas ao banco de dados.
	 * No exemplo acima: .ObterPorId(), ele irá fazer um select trazendo somente o Pedido.
	 * Ao fazer .getItens() ele irá fazer um outro select para pegar os ItemPedido.
	 * 
	 * Quando há uma relação ...ToOne(Como em ItemPedido-Pedido) o JPA fará
	 * fetch EAGER, fazendo somente uma consulta, trazendo todos os dados de uma só vez.
	 * 
	 * A questão do FETCH é justamente o desempenho da aplicação. Se na maior parte das vezes eu utilizar
	 * o SELECT para buscar dados somente de 'pedido', não há necessidade de buscar também os dados
	 * de ItemPedido, o que pode gerar uma queda de desempenho da aplicação.
	 * 
	 * Entretanto, se houver uma relação ToMany onde a freaquencia que você precise pegar informações de outras tabelas
	 * é grande, além da principal, é possível utilizar o EAGER.
	 * 
	 * Aconselhável é utilizar a configuração default e modificar quando houver necessidade.
	 * 
	 * */
	
	
}
