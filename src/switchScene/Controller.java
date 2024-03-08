package switchScene;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	private Parent root;
	private Stage stage;
	private Scene scene;
	
	public void switchScene_1(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("scene_1.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();//
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	public void switchScene_2(ActionEvent e) throws IOException {
		root = FXMLLoader.load(getClass().getResource("scene_2.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}
