package teste.heranca;

import infra.DAO;
import modelo.heranca.Pessoa;
import modelo.heranca.PessoaFisica;
import modelo.heranca.PessoaJuridica;

public class NovoPessoa {

	public static void main(String[] args) {
		DAO<Pessoa> dao = new DAO<>();
		
		PessoaFisica pessoa1 = new PessoaFisica("Maria", "Ipanema", "78745845200");
		PessoaJuridica Pessoa2 = new PessoaJuridica("Flanela", "Copacabana", "1254785000165");
		
		
		dao.abrirTransacao()
			.incluir(pessoa1)
			.incluir(Pessoa2)
			.fecharTransacao()
			.fechar();
		
	}
}
