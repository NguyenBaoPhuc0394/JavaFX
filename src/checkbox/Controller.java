package checkbox;

import javafx.scene.control.CheckBox;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	CheckBox check;
	@FXML
	Label label;
	@FXML
	ImageView imv;
	
	Image img1 = new Image(getClass().getResourceAsStream("icons8-java-48.png"));
	Image img2 = new Image(getClass().getResourceAsStream("icons8-java-64.png"));
	
	public void turn(ActionEvent e) {
		
		if(check.isSelected()) {
			imv.setImage(img2);
			label.setText("ON");
		}
		else {
			imv.setImage(img1);
			label.setText("OFF");
		}
	}
}
