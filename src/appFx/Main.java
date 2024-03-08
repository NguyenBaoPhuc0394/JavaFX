package appFx;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;


public class Main extends Application{

	public static void main(String[] args) {
		launch(args);
	}
	
	public void start(Stage stage) throws Exception{
		//Stage stage = new Stage();
		  Group root = new Group();
		  Scene scene = new Scene(root,Color.BLACK);
		  
		  Image icon = new Image("icons8-java-48.png");
		  stage.getIcons().add(icon);
		  stage.setTitle("Stage Demo Program w00t w00t");
		  stage.setWidth(420);
		  stage.setHeight(420);
		  stage.setResizable(false);
//		  stage.setX(50);
//		  stage.setY(50);
		  stage.setFullScreen(true);
		  stage.setFullScreenExitHint("YOU CAN'T ESCAPE unless you press q");
		  stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		  
		  stage.setScene(scene);
		  stage.show();
	}
}

//--module-path "D:\AppData\JavaFx\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.fxml

/*--module-path "D:\AppData\JavaFx\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.fxml
--add-modules javafx.web
--add-modules javafx.media */