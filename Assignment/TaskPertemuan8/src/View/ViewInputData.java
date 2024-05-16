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
public class ViewInputData extends JFrame{        
    JLabel lNim=new JLabel("NIM");
    JTextField fNim=new JTextField();
    
    JLabel lName=new JLabel("NAME");
    JTextField fName=new JTextField();
    
    JLabel lAge=new JLabel("AGE");
    JTextField fAge=new JTextField();
    
    JButton btnAdd=new JButton("ADD");
    
    public ViewInputData(){
        setLayout(null);
        setSize(550, 200);
        setVisible(true);
        setLocationRelativeTo(null);

        add(lNim);
        add(fNim);
        add(lName);
        add(fName);
        add(lAge);
        add(fAge);
        add(btnAdd);

        lNim.setBounds(5, 35, 120, 20);
        lName.setBounds(5, 60, 120, 20);
        lAge.setBounds(5, 85, 120, 20);

        fNim.setBounds(150, 35, 120, 20);
        fName.setBounds(150, 60, 120, 20);
        fAge.setBounds(150, 85, 120, 20);

        btnAdd.setBounds(300, 35, 90, 20);     
    }

    public JTextField getfNim() {
        return fNim;
    }

    public void setfNim(JTextField fNim) {
        this.fNim = fNim;
    }

    public JTextField getfName() {
        return fName;
    }

    public void setfName(JTextField fName) {
        this.fName = fName;
    }

    public JTextField getfAge() {
        return fAge;
    }

    public void setfAge(JTextField fAge) {
        this.fAge = fAge;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }
    
    
    
    
}
