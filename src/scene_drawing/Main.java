package scene_drawing;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application{
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root,400,400,Color.LIGHTSKYBLUE);
		
		Text text = new Text();
		text.setText("JAva Fx hehehe");
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 30));
		text.setFill(Color.DARKGREEN);
		
		Line line = new Line();
		line.setStartX(200);
		line.setStartY(200);
		line.setEndX(400);
		line.setEndY(200);
		line.setStrokeWidth(5);
		line.setStroke(Color.RED);
		line.setOpacity(0.5);
		line.setRotate(45);
		
		Rectangle rec = new Rectangle();
		rec.setX(100);
		rec.setY(100);
		rec.setWidth(100);
		rec.setHeight(100);
		rec.setStroke(Color.BISQUE);
		rec.setStrokeWidth(5);
		rec.setFill(Color.AQUAMARINE);
		
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(200.0,200.0,300.0,300.0,200.0,300.0);
		triangle.setFill(Color.BEIGE);
		
		Circle cir = new Circle();
		cir.setCenterX(320);
		cir.setCenterY(320);
		cir.setRadius(50.0);
		cir.setFill(Color.CHOCOLATE);
		
		Image image = new Image("icons8-java-48.png");
		ImageView imv = new ImageView(image);
		imv.setX(250);
		imv.setY(250);
		
		root.getChildren().add(text);
		root.getChildren().add(line);
		root.getChildren().add(rec);
		root.getChildren().add(triangle);
		root.getChildren().add(cir);
		root.getChildren().add(imv);
		stage.setScene(scene);
		stage.show();
	}
}
