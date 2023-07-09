package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {

		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10); //espaço entre os elementos horizontalmente
		setVgap(10); //espaço entre os elementos verticalmente
		setPadding(new Insets(10)); //espaço que separa o flowPane do conteúdo de fora.
		
		setOrientation(Orientation.VERTICAL); //fluxo na qual os elementos irão seguir -> default: horizontal
		setAlignment(Pos.CENTER_RIGHT); //centralização dos elementos detro do flowPane.
		
		
		getChildren().addAll(q1, q2, q3, q4,q5);
	}
/*
 * FlowPane faz com que os elementos sigam o fluxo da tela.
 * Por padrão os elementos ficarão disponíveis do Topo para direita.
 * 
 * */	
}
