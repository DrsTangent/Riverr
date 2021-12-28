package controllers;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import relations.User;
import screeenComponents.gigWrapper;


import javafx.fxml.*;
import javafx.geometry.Insets;

public class userPanelController {
	
	//Over all Screen//
	@FXML
	VBox window;
	//Tab Pane//
	@FXML 
	TabPane tabPane;
	//Profile Tab//
	@FXML
	Tab profileTab;
	@FXML
	Label firstName;
	@FXML
	Label lastName;
	@FXML
	Label contactNumber;
	@FXML
	Label emailAddress;
	@FXML
	Label username;
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
	
	
	
	//Projects Tab//
	public void addProject()
	{
		
	}
	public void projectTabSelection()
	{
		
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
	public void profileTabSelection()
	{
		firstName.setText(User.getFirstName());
		lastName.setText(User.getLastName());
		contactNumber.setText(User.getContactNumber());
		emailAddress.setText(User.getEmailAddress());
		username.setText(User.getUserName());
		
	}

	//Gigs Tab//
	public void searchGig()
	{
		
	}
	
	public void viewOrders()
	{
		
	}	
	
	public void gigTabSelection()
	{
		
	}
	
	public void initialize()
	{
		SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
		selectionModel.select(profileTab);
		
		gigContainer.getChildren().add(new gigWrapper("Logo Designing", "Ali Hussain", "I will design a fucking logo for you", 99.0));
		gigContainer.getChildren().add(new gigWrapper("Logo Designing", "Ali Hussain", "I will design a fucking logo for you", 99.0));
	}
}
