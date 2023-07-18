package com.example.injecaoDependencia.services;

import org.springframework.beans.factory.annotation.Autowired;

public class PayService {

	@Autowired
	private TaxServices taxService;
	@Autowired
	private DeliverService deliverService;

//	public PayService(TaxServices taxService, DeliverService deliverService) {
//		this.deliverService = deliverService;
//		this.taxService = taxService;
//	}
	
	public double finalPrice(double cost, String state) {
		return cost + taxService.tax(cost) + deliverService.fee(state);
	}
}

/*
*DENTRO DE UMA APLICAÇÃO GRANDE, ESSA INSTÂNCIAÇÃO DAS CLASSES É TRABALHOSA.
*COM ISSO, HÁ VÁRIOS FRAMEWORKS, COMO SPRING, QUE POSSUEM MECANISMOS DE
*GERANCIAR AS DEPENDÊNCIAS.
*
* PASSOS A FAZER:
* 1 -> REGISTRAR OS COMPONENTES.
* @Component -> REGISTRA A CLASSE COMO UM COMPONENTE QUE SERÁ GERENCIADO PELO FRAMEWORK
* @Service -> FAZ A MESMA COISA QUE O '@Component'.
* @Autowired -> INJETA UMA DEPENDENCIA AUTOMATICAMENTE DENTRO DOS ATRIBUTOS.
* PODE UTILIZAR TANTO O CONSTRUTOR OU O @Autowired
* 
* 2 -> INDICAR QUAL COMPONENTE DEPENDE DE QUAL.
*/