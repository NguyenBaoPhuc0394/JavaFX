package communicationControllers;


import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller_1 {
	private Parent root;
	private Stage stage;
	private Scene scene;
	@FXML
	TextField textfieldName;
	
	public void login(ActionEvent e) throws IOException {
		String user = textfieldName.getText();
		
		FXMLLoader fx = new FXMLLoader(getClass().getResource("scene_2.fxml"));
		root = fx.load();
		
		Controller_2 control = fx.getController();
		control.display(user);
		
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();	
		
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
}
