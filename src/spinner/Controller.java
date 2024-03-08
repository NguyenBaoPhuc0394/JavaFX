package spinner;

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
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller implements Initializable{
	@FXML
	Label label;
	@FXML
	Spinner<Integer>mySpinner;
	
	int current;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 10);
		valueFactory.setValue(0);
		mySpinner.setValueFactory(valueFactory);
		current = mySpinner.getValue();
		label.setText(current + "");
		mySpinner.valueProperty().addListener(new ChangeListener<Integer>() {

			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				// TODO Auto-generated method stub
				current = mySpinner.getValue();
				label.setText(current + "");
			}
			
		});
	}
}
