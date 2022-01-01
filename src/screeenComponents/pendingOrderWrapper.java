package screeenComponents;

import javafx.scene.control.Label;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class pendingOrderWrapper extends VBox {
	private String gigName;
	private String freeLancerName;
	private String packageType;
	private String orderDescription;
	
	public pendingOrderWrapper(String gigName, String packageType, String freeLancerName, String orderDescription)
	{
		this.gigName = gigName;
		this.freeLancerName = freeLancerName;
		this.packageType = packageType;
		this.orderDescription = orderDescription;
		
		
		//Formatting//
		format();
		
		
	}
	private void format()
	{
		//Setting Up Data//
		Label name = new Label("Gig: " + this.gigName);
		Label fLName = new Label("FreeLancer : " + this.freeLancerName);
		Label packageType = new Label("Package Type: " + this.packageType);
		Label orderDescription = new Label("Description: " + this.orderDescription);

		// Joining things up
		this.getChildren().addAll(name, fLName, packageType, orderDescription);

		//Format
		this.setWidth(800);
		BorderStroke stroke = new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, new CornerRadii(5), BorderWidths.DEFAULT);
		this.setBorder(new Border(stroke));
		
	}
}
