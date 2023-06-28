package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>(Object.class);
		
		Pedido pedido = new Pedido();
		Produto produto = new Produto("Geladeira", 2389.99);
		ItemPedido item = new ItemPedido(pedido, produto, 7);
		
		dao.abrirTransacao()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharTransacao()
			.fechar();
	}
	
}
