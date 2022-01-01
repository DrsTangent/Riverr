package screeenComponents;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class completedOrderWrapper extends pendingOrderWrapper{
	private String working;
	public completedOrderWrapper(String gigName, String freeLancerName, String packageType, String orderDescription, String working) {
		super(gigName, freeLancerName, packageType, orderDescription);
		// TODO Auto-generated constructor stub
		this.working = working;
		
		this.getChildren().add(new Label("Work:"));
		TextArea workingArea = new TextArea(this.working);
		workingArea.setEditable(false);
		workingArea.setWrapText(true);
		this.getChildren().add(workingArea);
	}

}
