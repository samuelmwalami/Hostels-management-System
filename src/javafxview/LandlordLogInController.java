package javafxview;

import hostel.LandlordModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LandlordLogInController implements Initializable {
    LandlordModel landlordLogin = new LandlordModel();
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private PasswordField enterPassword;
    @FXML
    private PasswordField confirmPassword;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void exitLo(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void landlordLogin(ActionEvent actionEvent) throws IOException {
        landlordLogin.setFirstName(firstName.getText());
        landlordLogin.setLastName(lastName.getText());
        landlordLogin.setEnterPassword(enterPassword.getText());
        landlordLogin.setConfirmPassword(confirmPassword.getText());
        landlordLogin.setPassword();

        if (landlordLogin.validateUser() == true){
            Parent root = FXMLLoader.load(getClass().getResource("studentHome.fxml"));
            stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            JOptionPane.showMessageDialog(null, "logged in successful");
            stage.show();

        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
        }

        Parent root= FXMLLoader.load(getClass().getResource("landlordHome.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }
}
