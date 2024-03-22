/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Internship extends JFrame{
    private String fname;
    private String fnim;
    private String candidate;
    private double fwe;
    private double fct;
    private double fit;
    private double score;
    private String result;
    
    //constructor
    public Internship (String fname, String fnim, String candidate, double fwe, double fct, double fit,double score,String result){
        this.fname=fname;
        this.fnim=fnim;
        this.candidate=candidate;
        this.fwe=fwe;
        this.fct=fct;
        this.fit=fit;
        this.score=score;
        this.result=result;  
    }
    
    //getter
    public String getFname() {
        return fname;
    }

    public String getFnim() {
        return fnim;
    }

    public String getCandidate() {
        return candidate;
    }

    public double getFwe() {
        return fwe;
    }

    public double getFct() {
        return fct;
    }

    public double getFit() {
        return fit;
    }

    public double getScore() {
        return score;
    }
    
    public String getResult() {    
        return result;
    }

    @Override
    public String toString() {
        return "Name : " + fname + "\nNIM=" + fnim + "\nCandidate :" + candidate + ", \nWriting Exam : " + fwe + "\nCoding Test : " + fct + "\nInterview Test" + fit + "\nScore=" + score + "\nResult=" + result + '}';
    }
    
   
    
 }
    
    
