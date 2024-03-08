package imageView;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML
	private ImageView imv;
	private Button button;
	
	private Image img = new Image(getClass().getResourceAsStream("icons8-c-sharp-logo-50.png"));
	
	public void display() {
		imv.setImage(img);
	}
}
