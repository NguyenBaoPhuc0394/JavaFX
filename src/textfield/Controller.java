package textfield;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Button sub;
	@FXML
	private Label label;
	@FXML
	private TextField tfield;
	
	int age;
	public void display(ActionEvent e) {
		try {
			age = Integer.parseInt(tfield.getText());
			if(age >= 18) {
				label.setText("Congratulation!!!");
			}
			else
				label.setText("You don't enought 18 ages");
		
		}catch(NumberFormatException n) {
			label.setText("please just a number");
		}
		catch(Exception err) {
			System.out.println(err);
		}
	}
}
