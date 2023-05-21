package oo.encapsulamento.casaA;

public class Paulo {

	void testeAcessos() {
		
		Ana esposa = new Ana();
		
//		System.out.println(esposa.segredo); //private
		System.out.println(esposa.facoDentroDeCasa); //default
		System.out.println(esposa.formaDeFalar); //protected
		System.out.println(esposa.todosSabem); //public
		
		/*
		 Nesse casso, A classe Paulo pode acessar de ana os atributos e métodos:
		 default -> pois estão no mesmo pacote
		 protected -> pois estão no mesmo pacote
		 public -> pois está publico
		 
		 Não é possível importar:
		 private -> pois somente a classe Ana pode utilizar.
		 */
	}
}
