/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Internship;
import view.GUI;

/**
 *
 * @author Lenovo
 */
public class InternshipController {
    GUI isview;
    double score;
    String candidate;
    String result;
    
    public InternshipController (GUI isview){
        this.isview=isview;
        
        isview.bcheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fname=isview.getFname().getText();
                String fnim=isview.getFnim().getText();
                //String candidate=isview.getRad().isSelected()?"Android Developers" : "Web Developers";
                double fwe=isview.getFwe().getColumns();
                double fct=isview.getFct().getColumns();
                double fit=isview.getFwe().getColumns();
                
                //final score based the candidate
                if (isview.getRad().isSelected()){
                    String candidate="Android Developer";
                    double score=(fwe*0.2)+(fct*0.5)+(fit*0.3);
                }else if (isview.getRwd().isSelected()){
                    String candidate="Web Developer";
                    double score=(fwe*0.4)+(fct*0.35)+(fit*0.25);
                }
                
                if (score>=85){
                    String result="ACCEPTED";
                }else{
                    String result="NOT ACCEPTED";
                }

                Internship intern=new Internship(fname, fnim, candidate, fwe, fct, fit, score, result);
            }
        });
    }
}
