package communicationControllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller_2 {
	@FXML
	Label labelName;
	// luu y : o trong fime scene2.fxml, phai de : fx:controller="communicationControllers.Controller_2"
	public void display(String user) {
		labelName.setText(labelName.getText() + user);
	}
}
