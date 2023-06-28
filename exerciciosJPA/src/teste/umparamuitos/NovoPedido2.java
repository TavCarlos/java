package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido2 {

	//Criar um ItemPedido com produto que já existe no banco de dados.
	
	public static void main(String[] args) {
		
		DAO<Produto> daoProduto = new DAO<>(Produto.class);
		DAO<Object> dao = new DAO<>(Object.class);
		
		Pedido pedido = new Pedido();
		Produto produto = daoProduto.obterPorId(6L);
		ItemPedido item = new ItemPedido(pedido, produto, 5);
		
		dao.abrirTransacao()
			.incluir(pedido)
			.incluir(item)
			.fecharTransacao()
			.fechar();
		/*Como estou presistindo ItemPedido que contém um produto já existente,
		 * não há necessidade de persistir o produto novamente.*/
	}
}
