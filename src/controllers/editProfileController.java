package controllers;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import screeenComponents.customDialogBox;
import screeenComponents.loaders;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;

public class editProfileController {
	
	final private static String title = "Riverr-Edit Profile";
	final private static String fxml = "../layouts/editprofile.fxml";
	
	public static void init()
	{
		customDialogBox dialog = new customDialogBox(title, fxml);
		
		//Showing Dialog Box
		dialog.showAndWait();
	}
	@FXML
	TextField firstName;
	@FXML
	TextField lastName;
	@FXML
	TextField contactNumber;
	@FXML
	TextField emailAddress;
	
	
	@FXML
	TextField userName;
	@FXML
	public void saveChanges()
	{
		System.out.print("checkin");
	}
}
