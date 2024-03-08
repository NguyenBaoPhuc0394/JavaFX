package animation;

import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable{
	
	@FXML
	ImageView imv;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//translate
//		TranslateTransition translate = new TranslateTransition();
//		translate.setNode(imv);
//		translate.setDuration(Duration.millis(1000));
//		translate.setCycleCount(TranslateTransition.INDEFINITE);
//		translate.setByX(250);
//		translate.setByY(-250);
//		translate.setAutoReverse(true);
//		translate.play();
		
		//Rotate
//		RotateTransition rotate = new RotateTransition();
//		rotate.setNode(imv);
//		rotate.setDuration(Duration.millis(1000));
//		rotate.setCycleCount(RotateTransition.INDEFINITE);
//		rotate.setInterpolator(Interpolator.LINEAR);
//		rotate.setByAngle(360);
//		rotate.setAxis(Rotate.X_AXIS);
//		rotate.setAxis(Rotate.Y_AXIS);
//		rotate.setAxis(Rotate.Z_AXIS);
//		rotate.play();
		
		//fade
//		FadeTransition fade = new FadeTransition();
//		fade.setNode(imv);
//		fade.setDuration(Duration.millis(1000));
//		fade.setCycleCount(FadeTransition.INDEFINITE);
//		fade.setInterpolator(Interpolator.LINEAR);
//		fade.setFromValue(0);
//		fade.setToValue(1);
//		fade.play();
		
		//scale
		ScaleTransition scale = new ScaleTransition();
		scale.setNode(imv);
		scale.setDuration(Duration.millis(1000));
		scale.setCycleCount(ScaleTransition.INDEFINITE);
		scale.setInterpolator(Interpolator.LINEAR);
		scale.setByX(2);
		scale.setByY(2);
		scale.play();
	}
	
}
