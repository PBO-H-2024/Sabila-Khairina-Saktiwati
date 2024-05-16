/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */

public class ViewReadData extends JFrame {
    JFrame window = new JFrame("Read Data Student");
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object columnName[] = {
        "ID", "NIM", "Name", "Age"
    };
    
    JButton btnAdd = new JButton("ADD");
    JButton btnRefresh = new JButton("REFRESH");
    
    public ViewReadData() {
        tableModel = new DefaultTableModel(columnName, 0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
      
        window.setLayout(null);
        window.setSize(550, 600);
//        window.setDefaultCloseOperation(3);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
        window.setResizable(false);

        window.add(scrollPane);
        window.add(btnAdd);
        window.add(btnRefresh);
        scrollPane.setBounds(20, 35, 500, 300);
        btnAdd.setBounds(20, 350, 90, 20);
        btnRefresh.setBounds(120, 350, 120, 20);
    }

    public void setTableData(String[][] data) {
        tabel.setModel(new DefaultTableModel(data, columnName));
    }

    public JTable getTabel() {
        return tabel;
    }

    public void setTabel(JTable tabel) {
        this.tabel = tabel;
    }

    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }

    public void setBtnRefresh(JButton btnRefresh) {
        this.btnRefresh = btnRefresh;
    }
    
    
}
