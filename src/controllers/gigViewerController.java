package controllers;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import screeenComponents.loaders;

public class gigViewerController {
	@FXML
	Label freeLancerName;
	@FXML
	Label userName;
	@FXML
	Text description;
	@FXML
	HBox packageWindow;
	
	public void initialize()
	{
		Parent checkin = loaders.loadScene("../layouts/packageViewer.fxml");
		packageWindow.getChildren().add(checkin);
	}
}
