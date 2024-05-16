/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.ModelConnector;
import View.ViewInputData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LENOVO
 */
public class ControllerInputData {
    ModelConnector connector;
    ViewInputData view;

    public ControllerInputData (ModelConnector connector, ViewInputData view) {
        this.connector = connector;
        this.view = view;

        view.getBtnAdd().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                connector.insertData(Integer.parseInt(view.getfNim().getText()), view.getfName().getText(),Integer.parseInt(view.getfAge().getText()));
            }
        });
    }
    
    public ModelConnector getConnector() {
        return connector;
    }

    public ViewInputData getView() {
        return view;
    }
}
