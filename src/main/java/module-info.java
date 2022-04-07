module com.example.expenserecordkeeper {
	requires javafx.controls;
	requires javafx.fxml;
	requires com.jfoenix;


	opens com.example.expenserecordkeeper to javafx.fxml;
	exports com.example.expenserecordkeeper;
}