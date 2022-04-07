package com.example.expenserecordkeeper;

import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable
{

	@FXML
	private StackPane root;

	@FXML
	private AnchorPane anchorPane;

	@FXML
	private VBox vbox;

	@FXML
	private BorderPane borderPane;

	@FXML
	private JFXButton periodButton;

	@FXML
	private JFXButton saveButton;

	@FXML
	private JFXButton emailButton;

	@FXML
	private JFXButton printButton;

	@FXML
	private JFXButton exitButton;

	@FXML
	private TableView<?> tableView;

	@FXML
	private TableColumn<?, ?> dateCol;

	@FXML
	private TableColumn<?, ?> nameCol;

	@FXML
	private TableColumn<?, ?> typeCol;

	@FXML
	private TableColumn<?, ?> methodCol;

	@FXML
	private TableColumn<?, ?> amountCol;

	@FXML
	private TableColumn<?, ?> fptdCol;

	@FXML
	private TableColumn<?, ?> actionCol;


	@Override
	public void initialize(URL url, ResourceBundle resourceBundle)
	{

	}
}
