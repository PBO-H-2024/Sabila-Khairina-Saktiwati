/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class View {
    JFrame window=new JFrame("PT OOP");
    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object columnName[] = {
        "Name", "Path", "Writing", "Coding", "Interview", "Score", "Status"
    };
     
    //input data
    JLabel lname=new JLabel("Name");
    JTextField fname=new JTextField();
    JLabel lpath=new JLabel("Path");
    String[] path = { "Android Developer", "Web Developer"};
    JComboBox fpath = new JComboBox(path);
    JLabel lwriting=new JLabel("Writing");
    JTextField fwriting=new JTextField();
    JLabel lcoding=new JLabel("Coding");
    JTextField fcoding=new JTextField();
    JLabel linterview=new JLabel("Interview");
    JTextField finterview=new JTextField();
    
    
    JButton btnAdd=new JButton("Add");
    JButton btnUpd = new JButton("Update");
    JButton btnDlt = new JButton("Delete");
    JButton btnRefresh = new JButton("Refresh");
    
    public View(Controller controller){
        tableModel = new DefaultTableModel(columnName, 0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);

        //set visualization
        window.setLayout(null);
        window.setSize(750,400);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //add data
        window.add(scrollPane);
        window.add(lname);
        window.add(fname);
        window.add(lpath);
        window.add(fpath);
        window.add(lwriting);
        window.add(fwriting);
        window.add(lcoding);
        window.add(fcoding);
        window.add(linterview);
        window.add(finterview);
        
        
        window.add(btnAdd);
        window.add(btnUpd);
        window.add(btnDlt);
        window.add(btnRefresh);
        
        //set visualization
        scrollPane.setBounds(20, 20, 450, 200);
        
        lname.setBounds(500, 20, 120, 20);
        fname.setBounds(500, 40, 200, 20);
        lpath.setBounds(500, 60, 120, 20);
        fpath.setBounds(500, 80, 200, 20);
        lwriting.setBounds(500, 100, 120, 20);
        fwriting.setBounds(500, 120, 200, 20);
        lcoding.setBounds(500, 140, 120, 20);
        fcoding.setBounds(500, 160, 200, 20);
        linterview.setBounds(500, 180, 120, 20);
        finterview.setBounds(500, 200, 100, 20);
        
        btnAdd.setBounds(500, 250, 90, 20);
        btnUpd.setBounds(500, 270, 90, 20);
        btnRefresh.setBounds(500, 290, 90, 20);
        btnDlt.setBounds(500, 310, 90, 20);
               
        String[][] data = controller.readData();
        table.setModel(new DefaultTableModel(data, columnName));
            
        //button add
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertData(fname.getText(), fpath.getSelectedItem().toString() ,Double.parseDouble(fwriting.getText()), Double.parseDouble(fcoding.getText()),Double.parseDouble(finterview.getText()));
            }
        });
        
        //button update
        btnUpd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.updateData(fname.getText(), fpath.getSelectedItem().toString() ,Double.parseDouble(fwriting.getText()), Double.parseDouble(fcoding.getText()),Double.parseDouble(finterview.getText()));
            }
        });
        
        //button delete
        btnDlt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.deleteData(fname.getText());
            }
        });
        
        //button refresh
        btnRefresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] data = controller.readData();
                table.setModel(new DefaultTableModel(data, columnName));
            }
        });
        
        //table click
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
                fname.setText(table.getValueAt(row, 0).toString());
                fpath.setSelectedItem(table.getValueAt(row, 1).toString());
                fwriting.setText(table.getValueAt(row, 2).toString());
                fcoding.setText(table.getValueAt(row, 3).toString());
                finterview.setText(table.getValueAt(row, 4).toString());
            }
        });
    }
    
}
