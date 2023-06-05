package padroes.observer;


/*
 * Essa classe implementa a Interface pois ela que está interessada em ser notificada quando o evento acontecer.
 * */

public class Namorada implements ChegadaAniversarianteObservador {
	
	@Override
	public void Chegou(EventoChegadaAniversariante evento) { //passo a passo após ser notificado da chegada no aniversariante
		System.out.println("Avisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("SURPRESA!!!!!");
	}
	
}
