/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.ModelConnector;
import View.ViewUpdateData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author LENOVO
 */
public class ControllerUpdateData {
    ModelConnector connector;
    ViewUpdateData view;
    int id;

    public ControllerUpdateData(ModelConnector connector, ViewUpdateData view, int id) {
        this.connector = connector;
        this.view = view;
        this.id = id;

        view.btnUpd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connector.updateData(id, Integer.parseInt(view.fNim.getText()), view.fName.getText(), Integer.parseInt(view.fAge.getText()));
            }
        });
    }
}
