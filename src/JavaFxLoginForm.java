
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

@RestController
public class JavaFxLoginForm extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	@RequestMapping("/login")
	public void start(Stage primaryStage) throws Exception {
		System.out.println("Java Login Form");	
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(12);
		grid.setVgap(12);
		
		grid.setPadding(new Insets(20));
		
		Label username = new Label("UserName");
		Label password = new Label("Password");
		Label result = new Label();
		
		TextField userName =  new TextField();
		PasswordField passWord = new PasswordField();
		
		Button button = new Button();
		button.setText("Sign in");
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				//System.out.println("you clicked for sign in:");
				result.setText("you clicked the sign in button");
			}
		});
		
		grid.add(username, 1,1);
		grid.add(userName, 2,1);
		grid.add(password, 1,2);
		grid.add(passWord, 2,2);
		grid.add(button, 2,4);
		grid.add(result, 2, 6);
		
		Scene scene = new Scene(grid, 450, 350);
		
		primaryStage.setScene(scene);
		
		
		
		primaryStage.show();
	}
	}
