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

public class MyHostelController implements Initializable {
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void landlordHome(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("landlordHome.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }


    public void createHostel(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("createHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void welcomeLogin(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("welcomeLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void editHostel(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("editHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
