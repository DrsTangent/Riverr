package controllers;

import javafx.scene.control.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import relations.User;
import screeenComponents.gigWrapper;

import java.util.ArrayList;

import DataManagment.dataRetrival;
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
		ArrayList<ArrayList<Object>> gigs = dataRetrival.getGigs();
		for (ArrayList<Object> gigView: gigs)
		{
			gigWrapper gigwrapper = new gigWrapper(((BigDecimal)gigView.get(0)).intValue(), (String) gigView.get(1), 
					(String) gigView.get(3) + " " + (String) gigView.get(4), 
					(String) gigView.get(2), ((BigDecimal)gigView.get(5)).floatValue());
			gigContainer.getChildren().add(gigwrapper);
		}
	}
	
	public void initialize()
	{
		SingleSelectionModel<Tab> selectionModel = tabPane.getSelectionModel();
		selectionModel.select(profileTab);
	}
}
