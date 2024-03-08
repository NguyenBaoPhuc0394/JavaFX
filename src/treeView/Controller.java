package treeView;

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
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller implements Initializable{
	@FXML
	TreeView<String> treeView;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		TreeItem<String> root = new TreeItem<String>("programs",new ImageView(new Image("icons8-java-48.png")));
		
		TreeItem<String> a = new TreeItem<String>("java");
		TreeItem<String> b = new TreeItem<String>("js");
		TreeItem<String> c = new TreeItem<String>("C");
		
		root.getChildren().addAll(a,b,c);
		
		TreeItem<String> a1 = new TreeItem<String>("go");
		TreeItem<String> a2 = new TreeItem<String>("kotlin");
		a.getChildren().addAll(a1,a2);
		
		TreeItem<String> b1 = new TreeItem<String>("html");
		TreeItem<String> b2 = new TreeItem<String>("css");
		b.getChildren().addAll(b1,b2);
		
		TreeItem<String> c1 = new TreeItem<String>("c++");
		TreeItem<String> c2 = new TreeItem<String>("c#");
		c.getChildren().addAll(c1,c2);
		
		treeView.setRoot(root);
	}
	public void selectItem() {
		TreeItem<String> item = treeView.getSelectionModel().getSelectedItem();
		if(item != null) {
			System.out.println(item.getValue());
		}
	}
}
