package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class packageController {
	@FXML
	Label type;
	@FXML
	Label price;
	@FXML
	Label time;
	@FXML
	Text packageDescription;

	public void initialize()
	{
		System.out.print("Checkin");
	}
	@FXML
	public void orderPackage()
	{
		
	}
}
