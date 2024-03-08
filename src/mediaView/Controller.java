package mediaView;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class Controller implements Initializable{
	@FXML
	private MediaView media;
	@FXML
	private Button play,pause,reset;
	
	File file;
	Media m;
	MediaPlayer mp;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		file = new File("C:\\Users\\PHUC\\Videos\\Captures\\video.mp4");
		//file = new File("video.mp4");
		try {
			m = new Media(file.toURI().toURL().toString());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mp = new MediaPlayer(m);
		media.setMediaPlayer(mp);
	}
	
	public void pauseMedia() {
		mp.pause();
	}
	public void playMedia() {
		mp.play();
	}
	public void resetMedia() {
//		if(mp.getStatus() != mp.getStatus().READY) {
//			mp.seek(Duration.seconds(0.0));
//		}
		mp.seek(Duration.seconds(0.0));
	}
}
