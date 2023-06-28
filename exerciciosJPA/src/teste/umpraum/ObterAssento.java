package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterAssento {

	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Cliente cliente =  dao.obterPorId(1L);
		
		System.out.println(cliente.getAssento().getNome());
		
	}
	
	/*
	 * Como o cliente está relacionado com o assento, a partir de cliente é possível buscar o nome do acento.
	 * */
}
