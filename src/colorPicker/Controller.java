package colorPicker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller {
	@FXML
	AnchorPane pane;
	@FXML
	ColorPicker myColor;
	public void changeColor(ActionEvent e) {
		Color c = myColor.getValue();
		pane.setBackground(new Background(new BackgroundFill(c, null, null)));
	}
}
