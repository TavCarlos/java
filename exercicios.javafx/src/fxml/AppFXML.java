package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm(); //toExternalForm -> faz retornar String e não URL
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml"); //armazenando a url do arquivo fxml
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS); //getStylesheets precisa de String como parâmetro, por isso .toExternaForm();
		
		primaryStage.setResizable(false); //nao permite o usuáro aumentar o tamanho da tela.
		primaryStage.setTitle("Tela de Login");
		primaryStage.setScene(cena);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
