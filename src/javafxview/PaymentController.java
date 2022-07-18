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

public class PaymentController implements Initializable {
    Stage stage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void book(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("book.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }
}
