package padroes.observer;

import java.util.Date;

/*
 * A classe que representa o evento não é obrigatória
 * Logo, você irá precisar dela quando você tem informações associadas ao evento.
 * 
 * Assim, tem todas as informações necessárias para descrever o evento.
 * Qual tecla foi pressionada? O ctrl estava pressionado? Clicou com botão esquerdo ou direito do mouse?
 * 
 * Esse tive de inforamção está contido dentro da classe Evento, não bastando somente notificar quando acontecer.
 * */
public class EventoChegadaAniversariante {

	private final Date momento;
	
	EventoChegadaAniversariante(Date momento){
		this.momento = momento;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	
}
