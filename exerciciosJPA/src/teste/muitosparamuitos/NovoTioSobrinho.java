package teste.muitosparamuitos;

import infra.DAO;
import modelo.muitosparamuitos.Sobrinho;
import modelo.muitosparamuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Maria");
		Tio tio2 = new Tio("Carlos");
		
		Sobrinho sobrinha1 = new Sobrinho("Raissa");
		Sobrinho sobrinho2 = new Sobrinho("David");
		
		tia1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTio().add(tia1);
		
		tia1.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tia1);
		
		tio2.getSobrinhos().add(sobrinha1);
		sobrinha1.getTio().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho2);
		sobrinho2.getTio().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinha1)
			.incluir(sobrinho2)
			.fecharTransacao()
			.fechar();
	}
	
	/*
	 * Quando há uma relação direcional de muito para muitos
		o ideal é manter uma coerência nessa relação.
		Então, a tia1 é tia do sobrinho1, entretanto
		o sobrinho1 é sobrinho da tia1; Logo, o ideal é fazer esse tipo de coerencia relacional.
	 * */
}
