//import java.util.Scanner;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.control.TextField;
//
//import javafx.stage.Stage;

package com.connectfour;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GuiClient extends Application{

	@Override
	public void start(Stage stage) {
		AnchorPane root = new AnchorPane();
		root.setPrefSize(500, 250);


		Label label = new Label("Enter Username:");
		label.setLayoutX(100);
		label.setLayoutY(80);


		TextField usernameField = new TextField();
		usernameField.setLayoutX(220);
		usernameField.setLayoutY(75);
		usernameField.setPrefWidth(180);


		Button connectButton = new Button("Connect");
		connectButton.setLayoutX(220);
		connectButton.setLayoutY(120);


		Label errorLabel = new Label();
		errorLabel.setLayoutX(220);
		errorLabel.setLayoutY(160);
		errorLabel.setStyle("-fx-text-fill: red;");


		connectButton.setOnAction(e -> {
			String username = usernameField.getText().trim();
			if (username.isEmpty()) {
				errorLabel.setText("Username cannot be empty.");
			} else {
				errorLabel.setText("");
				System.out.println("Logging in with: " + username);
				// TODO: Add networking logic here
			}
		});


		root.getChildren().addAll(label, usernameField, connectButton, errorLabel);


		Scene scene = new Scene(root);
		stage.setTitle("Connect Four - Login");
		stage.setScene(scene);
		stage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
