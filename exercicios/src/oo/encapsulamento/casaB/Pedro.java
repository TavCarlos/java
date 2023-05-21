package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana; //como estão em pacotes distintos é necessário importar a classe.

public class Pedro extends Ana {

	
	void acessoTeste() {
		
		Ana mae = new Ana(); //opcional
		
//		System.out.println(mae.segredo); private
//		System.out.println(mae.facoDentroDeCasa); default
		System.out.println(formaDeFalar); //protected
		System.out.println(todosSabem); //private
		//ou
		System.out.println(mae.todosSabem);
	
		/*
		  Nesse casso, A classe Pedro pode acessar de ana os atributos e métodos:
		  protected -> pois é herdado de ana;
		  public -> pois é publico;
		 Importante ressaltar que por se tratar de atributos e métodos que são herdados
		 não são acessados por através da instância (composicao); você pode simplesmente acessa-los.
		 
		  Não é possível importar:
		  Private -> Somente a ana pode utilizar métodos privados;
		  default -> não fazem parte do mesmo pacote;
		 
		 */
		
	}
}
