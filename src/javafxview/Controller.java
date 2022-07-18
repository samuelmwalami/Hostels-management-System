/*
package javafxview;

import hostel.DatabaseConnection;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Controller  implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
   //Hostel variables
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    String hostelDescription;

    static String databaseName = "hostel";
    static String tableName = "hostel";

    //Landlord variables
    final String userType = "Landlord";
    String firstName;
    String lastName;
    String phoneNumber;
    String EnterPassword;
    String ConfirmPassword;

    String password;

    //student variables


    //fields used by database



    Stage stage;


    public void fetchHome(ActionEvent actionEvent) throws IOException {
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("landlordHome.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void logout(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void myhostel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("myHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();



    }

    public void hostel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("studentHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void createhostel(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("createHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void book(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("book.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void payment(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("payment.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void create(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("myHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void edit(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("editHostel.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    //Hostel logic
    public  void createHostel(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.hostelName).equals(null) && !(this.hostelLocation).equals(null) && !(this.numberOfRooms == Integer.parseInt(null)) && !(this.hostelDescription).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("Insert into " + tableName + " values ('" + this.hostelName + "','" + this.hostelLocation + "' ,'" + this.hostelDescription + "', '')");
            }
            else{
                JOptionPane.showMessageDialog(null,"All fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }





    public void setHostelName(String hostelName) {this.hostelName = hostelName;}
    public void setHostelLocation(String hostelLocation){
        this.hostelLocation = hostelLocation;
    }
    public void setNumberOfRooms(int numberOfRooms){
        this.numberOfRooms = numberOfRooms;
    }
    public void setHostelDescription(String hostelDescription){
        this.hostelDescription = hostelDescription;
    }
    //fields used by database












    // Hostel class test
    public String getHostelName() {
        return hostelName;
    }

    public String getHostelLocation() {
        return hostelLocation;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public String getHostelDescription() {
        return hostelDescription;
    }


    //Landlord logic
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEnterPassword(String enterPassword) {
        EnterPassword = enterPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword = confirmPassword;
    }

    public void setPassword() {
        if(this.EnterPassword.equals(this.ConfirmPassword)) {
            this.password = this.EnterPassword;
        }
    }
    public  void validateUserLandlord(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("select " + this.firstName + "," + this.lastName + "," + this.password + " from " + tableName + " where " + this.firstName + " ='firstName' and " + this.lastName + " ='lastName' and " + this.password + "='password'");
                JOptionPane.showMessageDialog(null, "logged in successful");
            }
            else{
                JOptionPane.showMessageDialog(null,"All fields required");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
        }

    }


    //dataBaseOperation(this.createUser);
    //}




    public  void createUserLandlord(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.phoneNumber).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("Insert into landlord values ('" + this.firstName + "','" + this.lastName + "' ,'" + this.phoneNumber + "', '" + this.password + "')");
            }
            else{
                JOptionPane.showMessageDialog(null,"All fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }










    //student logic





    public  void validateUserStudent(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("select " + this.firstName + "," + this.lastName + "," + this.password + " from " + tableName + " where " + this.firstName + " ='firstName' and " + this.lastName + " ='lastName' and " + this.password + "='password'");
                JOptionPane.showMessageDialog(null, "logged in successful");
            }
            else{
                JOptionPane.showMessageDialog(null,"All fields required");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Incorrect username or password");
        }

    }


    //dataBaseOperation(this.createUser);
    //}




    public  void createUserStudent(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.phoneNumber).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("Insert into student  values ('" + this.firstName + "','" + this.lastName + "' ,'" + this.phoneNumber + "', '" + this.password + "')");
            }
            else{
                JOptionPane.showMessageDialog(null,"All fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public String getUserType() {
        return userType;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }


    public void updateHostelName(ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.hostelLocation).equals(null)){
                Statement statement = connectDb.createStatement();
                statement.execute("update " + tableName + "set hostelName where id='" + this.hostelName + "'");
                this.hostelName = hostelName;
            }
            else{
                JOptionPane.showMessageDialog(null,"The fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateHostelLocation(ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.hostelLocation).equals(null)){
                Statement statement = connectDb.createStatement();
                statement.execute("update " + tableName + "set hostelName where id='" + this.hostelLocation + "'");
                this.hostelName = hostelName;
            }
            else{
                JOptionPane.showMessageDialog(null,"The fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateNumberOfRooms(ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.numberOfRooms == Integer.parseInt(null))){
                Statement statement = connectDb.createStatement();
                statement.execute("update " + tableName + "set hostelName where id='" + this.numberOfRooms + "'");
                this.hostelName = hostelName;
            }
            else{
                JOptionPane.showMessageDialog(null,"The fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void updateHostelDescription(ActionEvent actionEvent) {
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.hostelDescription).equals(null)){
                Statement statement = connectDb.createStatement();
                statement.execute("update " + tableName + "set hostelName where id='" + this.hostelDescription + "'");
                this.hostelName = hostelName;
            }
            else{
                JOptionPane.showMessageDialog(null,"The fields required");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void exitLo(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void signin(ActionEvent actionEvent) throws IOException {
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Parent root= FXMLLoader.load(getClass().getResource("landLordSignIn.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }



    public void exitRe1(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void loginland(ActionEvent actionEvent) throws IOException {
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        Parent root = FXMLLoader.load(getClass().getResource("landlordLogin.fxml"));
        stage.setScene(new Scene(root));
        stage.show();

    }

    public void studentsign(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("studentSignIn.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();

    }

    public void exitRe(ActionEvent actionEvent) {
        System.exit(0);
    }








    Stage stage;
    public void welcome(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("welcomeLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void welcomeSignup(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("welcomeSignIn.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void landlordsignin(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("landLordSignIn.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public void studentlogin(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("studentLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void landLord(ActionEvent actionEvent) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("landLordLogin.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
    public void login(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("studentSignIn.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }


    public void studentsignin(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("signln.fxml"));
        stage=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(new Scene(root));
        stage.show();
    }

    public void exitRe(ActionEvent actionEvent) {
        System.exit(0);
    }
}


*/


