package screeenComponents;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class packageViewer extends VBox{
	private int packageID;
	private String packageName;
	private String packageDetails;
	private double packagePrice;
	
	public packageViewer(int packageID, String packageName, String packageDetails, double packagePrice)
	{
		this.packageID = packageID;
		this.packageName = packageName;
		this.packageDetails = packageDetails;
		this.packagePrice = packagePrice;
		
		format();
	}
	
	private void format()
	{
		/*Making Details*/
		Label pkgName = new Label(this.packageName);
		
		Label pkgPrice = new Label("Price: " + Double.toString(this.packagePrice));
		
		Label pkgDetails = new Label("Description:\n" + this.packageDetails);
		pkgDetails.setWrapText(true);
		
		Button orderButton = new Button("Order");
		orderButton.setOnAction(e -> orderPackage());
		
		this.setPrefHeight(300);
		
		/*Adding Details etc*/
		this.getChildren().addAll(pkgName, pkgPrice, pkgDetails, orderButton);
		
		/*Alignment etc*/
		((HBox) this.getParent()).setHgrow(this, Priority.ALWAYS);
		this.setVgrow(pkgDetails, Priority.ALWAYS);
		this.setAlignment(Pos.TOP_CENTER);
	}
	
	public void orderPackage()
	{
		
	}
}
