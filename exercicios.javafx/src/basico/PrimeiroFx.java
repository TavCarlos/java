package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PrimeiroFx extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Button botaoA = new Button("A"); //cria um botão com layout
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		botaoA.setOnAction(e-> System.out.println("A")); //adiciona um evento ao botão 'A'.
		botaoB.setOnAction(e -> System.out.println("B"));
		botaoC.setOnAction(e -> System.exit(0));
		
		VBox box = new VBox(); //cria uma caixa vertical
		box.setSpacing(10); //adicona um padding entre os elementos dentro da box
		box.setAlignment(Pos.CENTER); //centraliza esses elementos dentro da box.
		box.getChildren().add(botaoA); //adiciona os botão dentro da box
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		Scene unicaCena =  new Scene(box, 100, 150); //parâmetros(a caixaVertical - width/height)
		
		primaryStage.setScene(unicaCena);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
