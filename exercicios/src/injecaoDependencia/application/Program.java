package injecaoDependencia.application;

import injecaoDependencia.services.DeliverService;
import injecaoDependencia.services.PayService;
import injecaoDependencia.services.TaxService;

public class Program {

	public static void main(String[] args) {
		
		TaxService taxSerivce = new TaxService();
		DeliverService deliverService = new DeliverService();
		
		PayService payService = new PayService(taxSerivce, deliverService);
		
		System.out.println("PREÇO FINAL: " + payService.finalPrice(300, "SP"));
		
	}
}
/*
 *DENTRO DE UMA APLICAÇÃO GRANDE, ESSA INSTÂNCIAÇÃO DAS CLASSES É TRABALHOSA.
 *COM ISSO, HÁ VÁRIOS FRAMEWORKS, COMO SPRING, QUE POSSUEM MECANISMOS DE
 *GERANCIAR AS DEPENDÊNCIAS.
 * 
 * *IR PARA exercicios.sb*
 * */
