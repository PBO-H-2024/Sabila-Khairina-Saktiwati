/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Connector;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Controller {
    Connector connector;
    
    public Controller() {
        this.connector = new Connector();
    }

    public void insertData(String name, String path, double writing, double coding, double interview) {
        connector.insertData(name, path, writing, coding, interview);
        JOptionPane.showMessageDialog(null, "Insert Data Successful", "Insert Data", JOptionPane.INFORMATION_MESSAGE);
    }

    public String[][] readData() {
        return connector.readData();
    }

    public void updateData(String name, String path, double writing, double coding, double interview) {
        connector.updateData(name, path, writing, coding, interview);
        JOptionPane.showMessageDialog(null, "Update Data Successful", "Update Data", JOptionPane.INFORMATION_MESSAGE);
    }

    public void deleteData(String name) {
        connector.deleteData(name);
        JOptionPane.showMessageDialog(null, "Delete Data Successful", "Delete Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
