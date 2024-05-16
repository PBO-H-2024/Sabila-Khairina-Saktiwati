/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.ModelConnector;
import View.ViewInputData;
import View.ViewReadData;
import View.ViewUpdateData;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author LENOVO
 */
public class ControllerReadData {
    ModelConnector connector;
    ViewReadData view;

    public ControllerReadData(ModelConnector connector, ViewReadData view) {
        this.connector = connector;
        this.view = view;

        view.setTableData(connector.readData());

        view.getTabel().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                int row = view.getTabel().getSelectedRow();
                int id = Integer.parseInt(view.getTabel().getValueAt(row, 0).toString());
                String name = view.getTabel().getValueAt(row, 2).toString();

                int input = JOptionPane.showConfirmDialog(null, "Do you want to delete " + name + "?", "Option...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    connector.deleteData(id);
                } else {
                    input = JOptionPane.showConfirmDialog(null, "Do you want to update " + name + "?", "Option...", JOptionPane.YES_NO_OPTION);
                    if (input == 0) {
                        ViewUpdateData updateView = new ViewUpdateData();
                        ControllerUpdateData updateController = new ControllerUpdateData(connector, updateView, id);
                    }
                }
            }
        });

        view.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewInputData inputDataView = new ViewInputData();
                new ControllerInputData(connector, inputDataView);
            }
        });

        view.getBtnRefresh().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.setTableData(connector.readData());
            }
        });
    }
}
