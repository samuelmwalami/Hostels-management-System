package javafxview;

import hostel.StudentModel;
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

public class StudentLogInController implements Initializable {
    StudentModel studentLogin = new StudentModel();
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

    public void StudentHome(ActionEvent actionEvent) throws IOException {

        studentLogin.setFirstName(firstName.getText());
        studentLogin.setLastName(lastName.getText());
        studentLogin.setEnterPassword(enterPassword.getText());
        studentLogin.setConfirmPassword(confirmPassword.getText());
        studentLogin.setPassword();

        if (studentLogin.getValidateStudent() == true){
        Parent root = FXMLLoader.load(getClass().getResource("studentHome.fxml"));
        stage = (Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        JOptionPane.showMessageDialog(null, "logged in successful");
        stage.show();

    }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
        }
    }

    public void exitLo(ActionEvent actionEvent) {
        System.exit(0);
    }
}
