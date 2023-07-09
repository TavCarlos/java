package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane{

	public TesteAnchorPane() {

		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, 10.0);
		setLeftAnchor(q1, 10.0);
		
		Quadrado q2 = new Quadrado();
		setTopAnchor(q2, 10.0);
		setRightAnchor(q2, 10.0);
		
		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3, 10.0);
		
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);
		
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setBottomAnchor(centro, 110.0);
		setTopAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		
		Quadrado q5 = new Quadrado();
		centro.getChildren().add(q5);
	//	setTopAnchor(q5, 250.0); centraliza somente em um cenário específico, não sendo flexível
	//	setLeftAnchor(q5, 350.0);
		getChildren().addAll(q1, q2, q3, q4, centro);
		
	}
	/*
	 * AnchorPane é utilizado para ancorar os elementos em relação a distância das bordas.
	 * Podendo utilizar top, left, bottom, right para distanciar os elementos.
	 * 
	 * Para centralizar um elemento no meio não é muito simples, pois se tentar utilizar
	 * um setTopAnchor + setLeftAnchor, poderá centralizar mas somente em um cenário específico.
	 * fixando o objeto somente em relação ao topo e a esquerda.
	 * 
	 * Para que isso não ocorra, utiliza-se um Hbox ou Vbox, pois são mais flexível ao movimento do tamanho da tela
	 * e dentro do hbox eu 'Seto' para que ele fique na distância desejada, com isso insiro o objeto dentro dele.  
	 * 
	 * */
}
