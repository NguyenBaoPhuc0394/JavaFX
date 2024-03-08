package mp3_player;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class Controller implements Initializable{
	@FXML
	ProgressBar progressbar;
	@FXML 
	Label label;
	@FXML
	Button play,pause,reset,previous,next;
	@FXML
	Slider slider;
	@FXML
	ComboBox<String> speed;
	
	File dir;
	File[] files;
	
	Media media;
	MediaPlayer mediaPlayer;
	
	int songNumber;
	int[] speeds = {25,50,75,100,125,150,175,200};
	
	ArrayList<File> songs;
	
	Timer timer;
	TimerTask task;
	
	boolean running = false;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		songs = new ArrayList<File>();
		dir = new File("music");
		files = dir.listFiles();
		
		if(files != null) {
			for(File f : files) {
				songs.add(f);
			}
		}
		
		media = new Media(songs.get(songNumber).toURI().toString());
		mediaPlayer = new MediaPlayer(media);
		
		label.setText(songs.get(songNumber).getName());
		for(int i = 0;i < speeds.length;i++) {
			speed.getItems().add(Integer.toString(speeds[i])+"%");
		}
		speed.setOnAction(this::speed_media);
		
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				// TODO Auto-generated method stub
				mediaPlayer.setVolume(slider.getValue()*0.01);
			}
		});
		
		//progressbar.setStyle("-fx-accent: green;");
		progressbar.setStyle("-fx-accent: blue;");
	}
	public void play_media() {
		beginTimer();
		speed_media(null);
		mediaPlayer.setVolume(slider.getValue()*0.01);
		mediaPlayer.play();
	}
	public void pause_media() {
		cancelTimer();
		mediaPlayer.pause();
	}
	public void reset_media() {
		progressbar.setProgress(0);
		mediaPlayer.seek(Duration.millis(0));
	}
	public void previous_media() {
		if(songNumber > 0) {
			songNumber--;
			
			mediaPlayer.stop();
			
			if(running)
				cancelTimer();
			
			media = new Media(songs.get(songNumber).toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			
			label.setText(songs.get(songNumber).getName());
			play_media();
		}
		else {
			songNumber = songs.size() - 1;
			mediaPlayer.stop();
			
			if(running)
				cancelTimer();
			
			media = new Media(songs.get(songNumber).toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			
			label.setText(songs.get(songNumber).getName());
			play_media();
		}
	}
	public void next_media() {
		if(songNumber < songs.size() - 1) {
			songNumber++;
			
			mediaPlayer.stop();
			
			if(running)
				cancelTimer();
			
			media = new Media(songs.get(songNumber).toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			
			label.setText(songs.get(songNumber).getName());
			play_media();
		}
		else {
			songNumber = 0;
			mediaPlayer.stop();
			
			if(running)
				cancelTimer();
			
			media = new Media(songs.get(songNumber).toURI().toString());
			mediaPlayer = new MediaPlayer(media);
			
			label.setText(songs.get(songNumber).getName());
			play_media();
		}
	}
	public void speed_media(ActionEvent e) {
		if(speed.getValue() == null) {
			mediaPlayer.setRate(1);
		}
		else {
			mediaPlayer.setRate(Integer.parseInt(speed.getValue().substring(0, speed.getValue().length() - 1))*0.01);
		}
	}
	public void beginTimer() {
		timer = new Timer();
		task = new TimerTask() {
			
			@Override
			public void run() {
				running = true;
				double current = mediaPlayer.getCurrentTime().toSeconds();
				double end = media.getDuration().toSeconds();
				progressbar.setProgress(current/end);
				
				if(current/end == 1) {
					cancelTimer();
				}
			}
		};
		timer.scheduleAtFixedRate(task, 1000, 1000);
	}
	public void cancelTimer() {
		running = false;
		timer.cancel();
	}

}
