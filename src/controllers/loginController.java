package controllers;

import application.Main;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class loginController {
	@FXML
	TextField usernameField;
	@FXML
	TextField passwordField;
	@FXML
	VBox window;
	
	public void initialize()
	{
		Main.primaryStage.setMinHeight(window.getPrefHeight());
		Main.primaryStage.setMinWidth(window.getPrefWidth());
	}
	public void loginACC()
	{
		System.out.println("L mera");
	}
	public void signUp()
	{
		Main.loadScene("../layouts/signup.fxml");
	}
}
