package choiceBox;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller implements Initializable{
	@FXML
	Label label;
	@FXML
	ChoiceBox<String> myChoice;
	String[] s = {"com","pho","bun"};
	public void getChoice(ActionEvent e) {
		label.setText(myChoice.getValue());
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {//khoi tao du lieu cho choiceBox
		myChoice.getItems().addAll(s);
		myChoice.setOnAction(this::getChoice);//
	}
}
