package controllers;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import screeenComponents.gigWrapper;


import javafx.fxml.*;
import javafx.geometry.Insets;

public class userPanelController {
	
	//Over all Screen//
	@FXML
	VBox window;
	//Profile Tab//
	@FXML
	Label firstName;
	@FXML
	Label lastName;
	@FXML
	Label contactNumber;
	@FXML
	Label emailAddress;
	@FXML
	Label userName;
	//
	@FXML
	TextField searchgigBar;
	@FXML 
	VBox gigsViewer;
	@FXML
	VBox gigContainer;
	@FXML
	VBox completedProjectWindow;
	@FXML
	VBox currentProjectWindow;
	@FXML
	ComboBox<?> searchOptions;
	
	
	
	public void initialize()
	{
		gigContainer.getChildren().add(new gigWrapper("Logo Designing", "Ali Hussain", "I will design a fucking logo for you", 99.0));
		gigContainer.getChildren().add(new gigWrapper("Logo Designing", "Ali Hussain", "I will design a fucking logo for you", 99.0));
	}
	//Functions//
	//Profile Tab//
	public void editProfile()
	{
		editProfileController.init();
	}
	
	public void changePass()
	{
		
	}
	
	//Gigs Tab//
	public void searchGig()
	{
		
	}
	

	public void viewOrders()
	{
		
	}
	
	//Projects Tab//
	public void addProject()
	{
		
	}
	
	
}
