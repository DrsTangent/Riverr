package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import screeenComponents.loaders;

public class Main extends Application {
	public static Stage primaryStage;
	@Override
	public void start(Stage primaryStage) {
		Main.primaryStage = primaryStage;
		try {
			Parent root =  loaders.loadScene("../layouts/login.fxml");
			Scene scene = new Scene(root);
			Main.primaryStage.setTitle("Riverr");
			Main.primaryStage.setScene(scene);
			Main.primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void loadScene(String fxml){
	    Parent pane;
		pane = loaders.loadScene(fxml);
		Scene scene = new Scene( pane );
	    primaryStage.setScene(scene);
	}
	public static void main(String[] args) {
		launch(args);
	}
}