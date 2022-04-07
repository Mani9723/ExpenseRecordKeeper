package com.example.expenserecordkeeper;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Dimension2D;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationMain extends Application
{

	final static int MIN_WIDTH = 1000;
	final static int MIN_HEIGHT = 600;
	@Override
	public void start(Stage stage) throws IOException
	{
		Rectangle2D rectangle2D = Screen.getPrimary().getBounds();
		FXMLLoader fxmlLoader = new FXMLLoader(ApplicationMain.class.getResource("home.fxml"));
		Scene scene = new Scene(fxmlLoader.load());
		stage.setTitle("Hello!");
		stage.setScene(scene);
//		stage.setMaximized(true);
		stage.setMinWidth(MIN_WIDTH);
		stage.setMinHeight(MIN_HEIGHT);
		stage.centerOnScreen();
		stage.show();
	}

	public static void main(String[] args)
	{
		launch();
	}
}