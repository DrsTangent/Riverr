package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import screeenComponents.customDialogBox;

public class confirmationController {
	
	final static String title = "Riverr-Action Confirmation";
	final static String fxml = "../layouts/confirmation.fxml";
	private static boolean confirm;

	@FXML
	PasswordField passField;
	
	public static boolean init()
	{
		confirm = false;
		
		customDialogBox dialog = new customDialogBox(title, fxml);
		
		//Showing Dialog Box
		dialog.showAndWait();
		
		//return the confirmation.
		return confirm;
	}
	
	@FXML
	public void imSure()
	{
		confirm = true;
	}
}
