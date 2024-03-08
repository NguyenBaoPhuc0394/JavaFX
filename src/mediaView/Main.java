package mediaView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("media.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

}

/*--module-path "D:\AppData\JavaFx\javafx-sdk-20.0.1\lib" --add-modules javafx.controls,javafx.fxml
--add-modules javafx.web
--add-modules javafx.media */
