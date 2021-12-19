package screeenComponents;

import java.awt.Component;

import javax.swing.border.Border;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

public class helperMethods {
	public static void setRegionBackground(Region region, Color color)
	{
		region.setBackground(new Background(new BackgroundFill(color, null, Insets.EMPTY)));
	}
}
