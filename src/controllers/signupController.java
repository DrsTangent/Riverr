package controllers;

import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import application.Main;
import javafx.fxml.*;
public class signupController {
	@FXML
	TextField firstName;
	@FXML
	TextField lastName;
	@FXML
	TextField contactNum;
	@FXML
	TextField emailAddress;
	@FXML
	TextField userName;
	@FXML
	PasswordField password;
	@FXML
	PasswordField confirmPassword;
	@FXML
	VBox window;
	
	public void initialize()
	{
		Main.primaryStage.setMinHeight(window.getPrefHeight());
		Main.primaryStage.setMinWidth(window.getPrefWidth());
	}
	public void loginAccount()
	{
		Main.loadScene("../layouts/login.fxml");
	}
	public void signup()
	{
		
	}
}
