/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class Connector {
    //database
    String DBurl="jdbc:mysql://localhost/recruit_db";
    String DBusername="root";
    String DBpassword="";
    
    Connection conn;
    Statement statement;
    
    public Connector(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);
            System.out.println("Connection Success");
        }catch(Exception ex){
            System.out.println("Connection Failed"+ex.getMessage());
        }
    }
    
    //insert data
    public void insertData(String name, String path, double writing, double coding, double interview){
        try{
            double score =scorec (path, writing, coding, interview);
            String status=statusc (score);
            String query="INSERT INTO `recruitment`(`name`,`path`,`writing`,`coding`,`interview`,`score`,`status`) VALUES ('"+name+"','"+path+"','"+writing+"','"+coding+"','"+interview+"','"+score+"','"+status+"')";
            
            statement=conn.createStatement();
            statement.executeUpdate(query);  
            System.out.println("Input Success");
        }catch(Exception ex){
            System.out.println("Input Failed"+ex.getMessage());
        }
    }
    
    //read data
    public String[][] readData(){
        String data[][] = new String[15][7]; 
        try{
            int totalData = 0;
            String query = "SELECT * FROM recruitment";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                data[totalData][0] = resultSet.getString("name");
                data[totalData][1] = resultSet.getString("path");
                data[totalData][2] = resultSet.getString("writing");
                data[totalData][3] = resultSet.getString("coding");
                data[totalData][4] = resultSet.getString("interview");
                data[totalData][5] = resultSet.getString("score");
                data[totalData][6] = resultSet.getString("status");
                totalData++;
            }
            statement.close();
        }catch(SQLException e){
            System.out.println("SQL Error" + e.getMessage());
        }finally{
            return data;
        }
    }
    
    //update data
    public void updateData(String name, String path, double writing, double coding, double interview){
        try{
            double score =scorec (path, writing, coding, interview);
            String status=statusc (score);
            String query = "UPDATE `recruitment` SET name= '" + name+ "',"
                    + " path= '" + path+ "',"
                    + " writing='" + writing+ "',"
                    + " coding='" + coding+ "',"
                    + " interview='" + interview+ "',"
                    + " score='" + score+ "',"
                    + " status='" + status+ "'WHERE name = '" + name + "'";
            
            statement = conn.createStatement();
            statement.executeUpdate(query);
            
            System.out.println("Update Success");
        }catch(Exception ex){
            System.out.println("Update Failed : " + ex.getMessage());
        }
    }
    
    //delete data
    public void deleteData(String name){
        try{
            String query = "DELETE FROM `recruitment` WHERE name='" + name + "'";
            
            statement = conn.createStatement();
            statement.executeUpdate(query);
            
            System.out.println("Delete Success");
        }catch(Exception ex){
            System.out.println("Delete Failed : " + ex.getMessage());
        }
    }
    
    //total score by path
    private double scorec (String path, double writing, double coding, double interview) {
        double score;
        switch (path) {
            case "Android Developer":
                score = writing*0.2+coding*0.5+interview*0.3;
                break;
            case "Web Developer":
                score = writing*0.4+coding*0.35+interview*0.25;
                break;
            default:
                score = 0;
                break;
        }
        return score;
    }
    
    //status by score
    private String statusc (double score){
        String status;
        if (score<85){
            status="NOT ACCEPTED";
        } else{
            status="ACCEPTED";
        }
        return status;
    }
}
