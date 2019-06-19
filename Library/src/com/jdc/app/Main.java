package com.jdc.app;

import com.jdc.app.controller.LoginController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	@Override
	public void start(Stage pstage) throws Exception {
		Parent root=FXMLLoader.load(LoginController.class.getResource("view/Login.fxml"));

		pstage.setScene(new Scene(root));
		pstage.show();

		
	}
	
	public static void main(String[] args) {
		launch();
	}

}
