package hostel;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

public class StudentModel {
    String userType = "Student";
    String firstName;
    String lastName;
    String phoneNumber;
    String EnterPassword;
    String ConfirmPassword;

    String password;
    boolean validateStudent = false;

    //fields used by database
    static String databaseName = "hostel";
    static String tableName = "student";

    //database commands to be executed


    //initialize landlord


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
    public  void validateUser(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("select firstName ,lastName ,password  from " + tableName + " where firstName = '" +this.firstName+ "'and lastName ='" +this.lastName+"' and password ='"+this.password+"'");

                this.validateStudent = true;
            }
            else{

                this.validateStudent = false;
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }



    }


    //dataBaseOperation(this.createUser);
    //}




    public  void createUser(){
        DatabaseConnection connectNow = new DatabaseConnection();
        Connection connectDb = connectNow.getConnection(databaseName);
        try{
            if(!(this.firstName).equals(null) && !(this.lastName).equals(null) && !(this.phoneNumber).equals(null) && !(this.password).equals(null)) {
                Statement statement = connectDb.createStatement();
                statement.execute("Insert into " + tableName + " values ('" + this.firstName + "','" + this.lastName + "' ,'" + this.phoneNumber + "', '" + this.password + "')");
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

    public String getFirstName(String text) {
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
    public boolean getValidateStudent(){
        return validateStudent;
    }

}
