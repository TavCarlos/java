package injecaoDependencia.services;

public class PayService {

	private TaxService taxService;
	
	private DeliverService deliverService;
	
	public PayService(TaxService taxService, DeliverService deliverService) {
		this.taxService = taxService;
		this.deliverService = deliverService;
	}
	
	public double finalPrice(double cost, String state) {
		return cost + taxService.tax(cost) + deliverService.fee(state);
	}
}
 /* -------------------------------------------------------------*
  *  FAZER:
  *  
  *  private TaxService taxService = new TaxService; 
  *  private DeliverService deliverService = new DeliverService;
  *  
  *  É UMA MÁ PRÁTICA, POIS, ESTARIA ACOPLANDO DEMAIS O 'TaxService' com o 'PayService'
  *  DIFICULTANDO A MANUTENÇÃO, COMO POR EXEMPLO, TROCAR A INSTÂNCIA DO 'TaxService' PARA OUTRA
  *  CLASSE QUE HERDA DE 'TaxService'.
  * 
  * PRINCIPIO 'OPEN-CLOSED-PRINCIPLE' -> A CLASSE DEVE SER FECHADA PARA MODIFICAÇÕES E ABERTA PARA EXTENSÕES.
  * ------------------------------------------------------------------------------------------------------------*
  * 
  * PARA EVITAR O AUTO-ACOPLAMENTO ENTRE OS COMPONENTES SEM FRAMEWORK:
  * 
  * UTILIZA-SE O PRINCÍPIO SOLID 'INJEÇÃO DE DEPENDENCIA'.
  * ENTÃO, É A INVERSÃO DE CONTROLE POR MEIO DA INJEÇÃO DE DEPENDENCIA.
  * 
  * SEM O FRAMEWORK É POSSÍVEL IMPLEMENTAR A INJEÇÃO DE DEPENDENCIA POR MEIO DO CONSTRUTOR, COMO VISTO ACIMA.
  * AO INVÉS DE INSTANCIAR COM 'new' DENTRO DO 'PayService' EU CRIO UM CONSTRUTOR PARA O 'PayService'
  * RECEBENDO COMO PARÂMETRO OS COMPONENTES INSTÂNCIADOS.
  * AGORA, O COMPONENTE 'PayService' NÃO CONHECE AS INSTÂNCIAS DAS DEPENDÊNCIAS DELE. QUEM FORNECERÁ ESSAS INSTÂNCIAS
  * OUTRA CLASSE FORA DE 'PayService', NO CASO A CLASSE 'Program'.
  * 
  * -------------------------------------------------------------------------------------------------------------*
  * POR QUE INVERSÃO DE CONTROLE?
  * POIS QUEM CONTROLAVA AS SUAS DEPÊNCIAS ERA O 'PayService', AGORA
  * OUTRA CLASSE VAI INSTÂNCIAR ESSAS INSTANCIAS E INJETAR PARA DENTRO DO 'PayService'
  * POR MEIO DO CONSTRUTOR.
  * AGORA, CASO HAJA NECESSIDADE DE FAZER UMA MANUTENÇÃO NA INSTÂNCIA DO 'TaxService' ou 'DeliverService'
  * NÃO HÁ NECESSIDADE DE MODIFICAR DENTRO DO 'PayService'.
  * */
