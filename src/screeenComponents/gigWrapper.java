package screeenComponents;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class gigWrapper extends wrapper {
	String gigName;
	String freeLancerName;
	String gigDescrip;
	double gigStandPrice;
	
	public gigWrapper(String gigName, String fLName, String gigDes, double price)
	{
		this.setHeight(40);
		this.gigName = gigName;
		this.freeLancerName = fLName;
		this.gigDescrip = gigDes;
		this.gigStandPrice = price;
		
		//Formatting//
		format();
	}
	
	public void action()
	{
		System.out.println("checkin");
	}
	
	private void format()
	{
		//Setting Up Data//
		Label name = new Label(gigName);
		Label fLName = new Label(freeLancerName);
		Label gigDesp = new Label(gigDescrip);
		Label price = new Label(String.valueOf(gigStandPrice));

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
