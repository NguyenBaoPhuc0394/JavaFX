package keyEvent;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("key.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(e.getCode());
				Controller c = loader.getController();
				switch(e.getCode()) {
				case W:
					c.up();
					break;
				case S:
					c.down();
					break;
				case A:
					c.left();
					break;
				case D:
					c.right();
					break;
				default:
					System.out.println(e.getCode());
				}
			}
		});
		
		stage.setScene(scene);
		stage.show();
	}

}
