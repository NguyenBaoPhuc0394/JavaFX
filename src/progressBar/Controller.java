package progressBar;

import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller implements Initializable{
	
	@FXML
	ProgressBar progress;
	@FXML
	Button button;
	@FXML
	Label label;
	
	BigDecimal d = new BigDecimal(String.format("%.2f", 0.0));
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		progress.setStyle("-fx-accent: blue");
	}
	public void increase() {
		if(d.doubleValue() < 1.0) {
			d = new BigDecimal(String.format("%.2f", d.doubleValue() + 0.1));
			progress.setProgress(d.doubleValue());
			label.setText(Math.round(d.doubleValue()*100)+ "%");
			
		}
	}
}
