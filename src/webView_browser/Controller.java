package webView_browser;

import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebHistory;
import javafx.scene.web.WebView;

public class Controller implements Initializable{
	@FXML
	WebView myWeb;
	@FXML
	TextField text;
	@FXML
	Button load,zoomIn,zoomOut,history;
	
	WebHistory his;
	WebEngine engine;
	String home;
	double zoom;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		engine = myWeb.getEngine();
		home = "www.google.com";
		text.setText(home);
		loadPage();
	}
	public void loadPage() {
		String s = text.getText();
		engine.load("http://"+s);
		
	}
	public void refreshPage() {
		engine.reload();
	}
	public void zoomIn() {
		zoom+=0.25;
		myWeb.setZoom(zoom);
	}
	public void zoomOut() {
		zoom-=0.25;
		myWeb.setZoom(zoom);
	}
	public void displayHistory() {
		his = engine.getHistory();
		ObservableList<WebHistory.Entry> enties = his.getEntries();
		for(WebHistory.Entry e : enties) {
			//System.out.println(e);
			System.out.println(e.getUrl() + " " + e.getLastVisitedDate());
		}
	}
	public void back() {
		his = engine.getHistory();
		ObservableList<WebHistory.Entry> enties = his.getEntries();
		his.go(-1);
		text.setText(enties.get(his.getCurrentIndex()).getUrl());
	}
	public void foward() {
		his = engine.getHistory();
		ObservableList<WebHistory.Entry> enties = his.getEntries();
		his.go(1);
		text.setText(enties.get(his.getCurrentIndex()).getUrl());
	}
}

//webView MediaView MP3_Player
