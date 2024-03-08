package radioButton;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class Controller {
	@FXML
	private RadioButton ramen,sushi,bread;
	@FXML
	private Label label;
	
	public void chose(ActionEvent e) {
		if(ramen.isSelected()) {
			label.setText("Ramen");
		}
		if(sushi.isSelected()) {
			label.setText("Sushi");
		}
		if(bread.isSelected()) {
			label.setText("Bread");
		}
	}
}
