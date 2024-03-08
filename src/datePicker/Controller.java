package datePicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class Controller {
	@FXML
	DatePicker datePick;
	@FXML
	Label label;
	public void getDate(ActionEvent e) {
		LocalDate myDate = datePick.getValue();
		String s = myDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy"));
		//label.setText(myDate.toString());
		label.setText(s);
	}
}
