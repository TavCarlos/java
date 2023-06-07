package br.com.empresa.cm.modelo;

public interface CampoObservador {

	public void eventoOcorreu(Campo campo, CampoEvento evento);
}
/*
 * Eu posso criar uma interface para conseguir criar uma list com todos os observadores ou
 * posso utilizar uma interface funcional  já existente <biConsumer>, não precisando criar essa interface;
 *  
 */
