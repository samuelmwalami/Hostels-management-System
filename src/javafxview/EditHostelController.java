package javafxview;

import hostel.HostelModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class EditHostelController implements Initializable {
    @FXML
    private TextField hostelName;
    @FXML
    private TextField hostelLocation;
    @FXML
    private TextField numberOfRooms;
    @FXML
    private TextArea hostelDescription;
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void welcomeLogin(ActionEvent actionEvent) throws IOException {
        HostelModel editHostel = new HostelModel();
        Parent root= FXMLLoader.load(getClass().getResource("welcomeLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void myHostel(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("myHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void editHostelName(ActionEvent actionEvent) {


    }

    public void editHostelLocation(ActionEvent actionEvent) {
    }

    public void editNumberOfRooms(ActionEvent actionEvent) {
    }

    public void editHostelDescription(ActionEvent actionEvent) {
    }
}
