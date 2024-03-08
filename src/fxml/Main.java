package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		  Parent root = FXMLLoader.load(getClass().getResource("graphics.fxml"));
		  Scene scene = new Scene(root);
		  //scene.getStylesheets().add(getClass().getResource("").toExternalForm());
//		  String css = getClass().getResource("application.css").toExternalForm();
//		  scene.getStylesheets().add(css);
		  stage.setScene(scene);
		  stage.show();
	}
}


//--module-path "D:\AppData\JavaFx\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.fxml