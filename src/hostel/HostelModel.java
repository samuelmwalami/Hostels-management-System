package hostel;

import javax.swing.*;
import java.sql.Connection;
import java.sql.Statement;

public class HostelModel {
    String hostelName;
    String hostelLocation;
    int numberOfRooms;
    String hostelDescription;

    static String databaseName = "hostel";
    static String tableName = "hostel";



    //dataBaseOperation(this.createUser);
    //}




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





    //update hostel details
    public void updateHostelName(String hostelName) {


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
    public void updateHostelLocation(String hostelLocation){

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
    public void updateNumberOfRooms(int numberOfRooms){

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
    public void updateHostelDescription(String hostelDescription){

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

}
