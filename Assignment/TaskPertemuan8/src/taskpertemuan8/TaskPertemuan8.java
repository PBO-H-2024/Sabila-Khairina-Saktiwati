/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskpertemuan8;
import Model.ModelConnector;
import View.ViewReadData;
import Controller.ControllerReadData;

/**
 *
 * @author LENOVO
 */
public class TaskPertemuan8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelConnector connector = new ModelConnector();
        ViewReadData readView = new ViewReadData();
        ControllerReadData readController = new ControllerReadData(connector, readView);
    }
    
}
