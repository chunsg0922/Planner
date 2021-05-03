package classSet;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.net.URL;
import java.net.URLClassLoader;
import java.lang.StringBuffer;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application{

	// main 메소드 부분 : 플래너를 실행하는 위치
	public static void main(String[] args) throws SQLException{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Parent root = FXMLLoader.load(getClass().getResource("/FXML/Mainpage.fxml"));
		Scene scene = new Scene(root);
		primaryStage.setTitle("마이플래너 v.1.0");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
}
