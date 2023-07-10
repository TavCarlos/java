package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane{

	public TesteStackPane() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		getChildren().addAll(c2, c3, c4, c5, c6, c1); //adiciona os elementos na instância
		
		setOnMouseClicked(e -> { //no click do mouse ....
			if(e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();
			} else {
				getChildren().get(5).toBack(); //Mesma ideia que o '.toFront()'
			}
		});
		
		//mudança automática dos elementos.
		//A vantagem de utiliar a thread é a possibilidade de utilizar o método .sleep
		// que permite que a gente suspenda uma aplicação com uma precisão de milissegundos ou nanossegundos.
		Thread t = new Thread(() -> { 
			while(true) {
				try {
					Thread.sleep(3000); //a cada 3000 milisegundos
					Platform.runLater(() -> { //FX não deixa criar thread, então é preciso fazer o runLater para funcionar.
						getChildren().get(0).toFront();
					});
				} catch (Exception e) {
					e.getCause();
				} 
			}
		});
		t.isDaemon(); //fecha a aplicação quando ele 
		t.start();
	}
	
	/*
	 * No StackPane é um layout de pilha, ficando um elemento em cima do outro.
	 * 
	 * getSceneX() -> retorna a posição horizontal do evento(inteiro).
	 * 
	 * Os elementos dentro dos getChildren seguem um padrão como um array: ou seja
	 * o primeiro elemento possui índice 0.
	 * Ao fazer '.toFront' eu pego aquele elemento e coloco ele na última posição.
	 * 
	 * Assim, no código, se o elemento c2 for o índice 0, ao evento do click
	 * ele será jogado para frente da pilha. Ou seja -> (c2, c3, c4, c5, c6, c1).get(0).toFront ->  c3, c4, c5, c6, c1, c2.
	 * Isso faz com que faça um loop dos elementos.
	 * */
}
