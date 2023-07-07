package teste.consultaNamedQuery;

import java.util.List;

import infra.DAO;
import modelo.consulta.Conta;

public class ObterConta {

	public static void main(String[] args) {

		DAO<Conta> dao = new DAO<>(Conta.class);
		
		List<Conta> contas = dao.ObterTodosComDescricaoAgua("Conta.ObterAgua");
		
		for(Conta conta: contas) {
			System.out.println(conta.getValor());
			System.out.println(conta.getDescricao());
		}
	}
	

	
}
