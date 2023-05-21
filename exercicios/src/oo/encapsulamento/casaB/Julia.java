package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	void acessoTeste() {
		
		Ana sogra = new Ana(); //opcional
		
//		System.out.println(mae.segredo); //private
//		System.out.println(mae.facoDentroDeCasa); //default
//		System.out.println(formaDeFalar); //protected
		System.out.println(sogra.todosSabem); //private
	
		/*
		  Nesse casso, A classe Paulo pode acessar de ana os atributos e métodos:
		  public -> pois é publico;
		 
		 
		  Não é possível importar:
		  Private -> Somente a ana pode utilizar métodos privados;
		  default -> não fazem parte do mesmo pacote;
		  protected -> pois não é herdado de ana e nem está no mesmo pacote.;
		 */
		
	} 
}
