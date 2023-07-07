package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application{
		
		private Stage janela; //como é preciso utilizar o primaryStage fora do método start, criar um atributo.
		private Scene passo1;
		private Scene passo2;
		private Scene passo3;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		janela = primaryStage;
		
		CriarPasso1();
		CriarPasso2();
		CriarPasso3();
		
		janela.setScene(passo1);
		janela.setTitle("Wizard :: passo 1");
		janela.show();
	}
	
	private void CriarPasso3() {
		
		Button passoAnterior = new Button("Voltar p/ passo 2");
		passoAnterior.setOnAction(e ->{
			janela.setTitle("Wizard :: passo 2");
			janela.setScene(passo2); //quando ocorrer a ação irá mudar a scena.
		});
		Button finalizar = new Button("finalizar aplicação");
		finalizar.setOnAction(e -> System.exit(0));
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(finalizar);
		
		passo3 = new Scene(box, 400, 400);
		
	}
	
	private void CriarPasso2() {
		Button passoAnterior = new Button("<< Voltar p/ passo 1");
		passoAnterior.setOnAction(e ->{
			janela.setTitle("Wizard :: passo 1");
			janela.setScene(passo1);
		});
		
		Button proximoPasso = new Button("Ir p/ passo 3 >>");
		proximoPasso.setOnAction(e -> {
			janela.setTitle("Wizard :: passo 3");
			janela.setScene(passo3);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		passo2 = new Scene(box, 400, 400);
	}
	
	private void CriarPasso1() {
		
		Button proximoPasso = new Button("Ir p/ passo 2 >>");
		proximoPasso.setOnAction(e -> {
			janela.setTitle("Wizard :: passo 2");
			janela.setScene(passo2);
		});
		
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		passo1 = new Scene(box, 400, 400);
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
