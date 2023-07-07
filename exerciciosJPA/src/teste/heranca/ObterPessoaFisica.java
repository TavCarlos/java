package teste.heranca;

import java.util.List;

import infra.DAO;
import modelo.heranca.PessoaFisica;

public class ObterPessoaFisica {

	public static void main(String[] args) {
		
		DAO<PessoaFisica> dao = new DAO<>(PessoaFisica.class);
		
		List<PessoaFisica> PessoasFisica = dao.consultar("PessoaFisica.ObterTodos");
		
		for(PessoaFisica pessoaFisica: PessoasFisica) {
			System.out.println(pessoaFisica.getNome());
		}
		
		
	}
}
