/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class ViewUpdateData extends JFrame{
    JFrame window = new JFrame("Update Data Student");
    public JLabel lNim = new JLabel("NIM");
    public JTextField fNim = new JTextField();

    public JLabel lName = new JLabel("NAME");
    public JTextField fName = new JTextField();

    public JLabel lAge = new JLabel("AGE");
    public JTextField fAge = new JTextField();

    public JButton btnUpd = new JButton("UPDATE");

    public ViewUpdateData() {
        window.setLayout(null);
        window.setSize(500, 200);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        
        window.add(lNim);
        window.add(lName);
        window.add(lAge);
        window.add(fNim);
        window.add(fName);
        window.add(fAge);
        window.add(btnUpd);
        
         //LABEL
        lNim.setBounds(5, 35, 120, 20);
        lName.setBounds(5, 60, 120, 20);
        lAge.setBounds(5, 85, 120, 20);
        
        //TEXTFIELD
        fNim.setBounds(150, 35, 120, 20);
        fName.setBounds(150, 60, 120, 20);
        fAge.setBounds(150, 85, 120, 20);
        
        //BUTTONPANEL
        btnUpd.setBounds(300, 35, 90, 20);
    }
}
