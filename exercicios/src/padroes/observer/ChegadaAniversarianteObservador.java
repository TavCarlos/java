package padroes.observer;
/*
 * É responsável por definir um método que será chamado quando um evento acontecer.
 * Logo, todo observador terá necessariamente que implementar uma interface.
 * */
public interface ChegadaAniversarianteObservador {

	
	public void Chegou(EventoChegadaAniversariante evento);
}
