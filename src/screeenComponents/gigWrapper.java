package screeenComponents;

import controllers.gigViewerController;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class gigWrapper extends wrapper {
	private int gigID;
	private String gigName;
	private String freeLancerName;
	private String gigDescrip;
	private double gigStandPrice;
	
	public gigWrapper(int gigID, String gigName, String fLName, String gigDes, double price)
	{
		this.setHeight(40);
		this.gigID = gigID;
		this.gigName = gigName;
		this.freeLancerName = fLName;
		this.gigDescrip = gigDes;
		this.gigStandPrice = price;
		
		//Formatting//
		format();
	}
	
	public void action()
	{
		gigViewerController.gigID = gigID;
		
		customDialogBox viewGig = new customDialogBox(gigName, "../layouts/gigviewer.fxml");
		
		viewGig.showAndWait();
	}
	
	private void format()
	{
		//Setting Up Data//
		Label name = new Label(gigName);
		Label fLName = new Label(freeLancerName);
		Label gigDesp = new Label(gigDescrip);
		Label price = new Label("Starting At " + String.valueOf(gigStandPrice));

		VBox detailsContainer = new VBox();
		HBox namesContainer = new HBox();

		// Joining things up
		namesContainer.getChildren().addAll(name, fLName);
		detailsContainer.getChildren().addAll(namesContainer, gigDesp);
		this.getChildren().addAll(detailsContainer, price);
		//Format
		name.setPadding(new Insets(0,30,0,0));
		this.setHgrow(detailsContainer, Priority.ALWAYS);
		helperMethods.setRegionBackground(price, Color.GREEN);
	}
	
}
