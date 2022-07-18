package javafxview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Book extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.initStyle(StageStyle.UTILITY);
        Parent root = FXMLLoader.load(getClass().getResource("book.fxml"));
        primaryStage.setScene(new Scene(root, 500, 496));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
