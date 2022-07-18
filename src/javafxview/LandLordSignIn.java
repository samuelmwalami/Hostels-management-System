package javafxview;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class LandLordSignIn extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.UNDECORATED);
        Parent root= FXMLLoader.load(getClass().getResource("landLordSignIn.fxml"));
        stage.setScene(new Scene(root,400,500));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
