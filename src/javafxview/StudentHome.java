package javafxview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StudentHome extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("studentHome.fxml"));
        primaryStage.setScene(new Scene(root, 841, 496));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }

}
