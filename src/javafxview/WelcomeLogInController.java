package javafxview;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeLogInController implements Initializable{
    Stage stage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    public void studentLogin(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("studentLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void landLordLogin(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("landlordLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void welcomeSignup(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("welcomeSignIn.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
