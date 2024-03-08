package fxml;


import javafx.fxml.FXML;
import javafx.scene.shape.Arc;
import javafx.event.ActionEvent;

public class Controller {
	@FXML
	private Arc myCircle;
	private double x,y;//phai can private
	
	public void Up(ActionEvent e) {
		myCircle.setCenterY(y -= 1);
	}
	public void Down(ActionEvent e) {
		myCircle.setCenterY(y += 1);
	}
	public void Left(ActionEvent e) {
		myCircle.setCenterX(x -= 1);
	}
	public void Right(ActionEvent e) {
		myCircle.setCenterX(x += 1);
	}
}
