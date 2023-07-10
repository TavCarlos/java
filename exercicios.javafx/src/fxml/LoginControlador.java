package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
/*
 * Um controlador é o meio do caminho entre solicitações da interface gráfica
 * e a lógica de uma aplicação. Faz parte do padrão de design Model-View-Controller
 * */
public class LoginControlador {

	@FXML
	private TextField campoEmail;
	
	@FXML //refere-se aos id's em login.fxml
	private PasswordField campoSenha;
	
	public void entrar() {
		System.out.println(campoEmail.getText());
		System.out.println(campoSenha.getText());
	}
}
