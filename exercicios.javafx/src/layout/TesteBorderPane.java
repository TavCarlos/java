package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {

		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1);
		
		Caixa c2 = new Caixa().comTexto("Esquerda");
		setLeft(c2);
		
		Caixa c3 = new Caixa().comTexto("Fundo");
		setBottom(c3);

		Caixa c4 = new Caixa().comTexto("Direita");
		setRight(c4);
		
		Caixa c5 = new Caixa().comTexto("Centro");
		setCenter(c5);
	}
	
	/*
	 * Diferentemente do AnchorPane não é necessário utilizar o getChildren().add() no objeto criado
	 * Pois já é setado automaticamente.
	 * */
}
