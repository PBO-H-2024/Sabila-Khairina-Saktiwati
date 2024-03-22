/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.Internship;

/**
 *
 * @author LENOVO
 */
public class GUI extends JFrame {
    JLabel ltitle=new JLabel(" Internship Program");
    
    //applicants identity
    JLabel lname=new JLabel("Name");
    JTextField fname=new JTextField();
    JLabel lnim=new JLabel("NIM");
    JTextField fnim=new JTextField();
    
    //internship candidate
    JLabel li=new JLabel ("Internship Candidate ");
    JRadioButton rad=new JRadioButton ("Android Developers");
    JRadioButton rwd=new JRadioButton ("Web Developers");
    
    //input tests score
    JLabel ltest=new JLabel ("Enter the Test Scores :");
    JLabel lwe=new JLabel (" 1. Writing Exam");
    JTextField fwe=new JTextField ();
    JLabel lct=new JLabel (" 2. Coding Test");
    JTextField fct=new JTextField ();
    JLabel lit=new JLabel (" 3. Interview Test");
    JTextField fit=new JTextField ();
    
    public JButton bcheck=new JButton (" Check Result");
    
    //constructor
    public GUI(){
        setTitle("PT.OOP");
        setSize(500,400);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        //group candidate
        ButtonGroup candidate=new ButtonGroup();
        candidate.add(rad);
        candidate.add(rwd);
        
        //add data
        add(ltitle);
        add(lname);
        add(fname);
        add(lnim);
        add(fnim);
        add(li);
        add(rad);
        add(rwd);
        add(ltest);
        add(lwe);
        add(fwe);
        add(lct);
        add(fct);
        add(lit);
        add(fit);
        add(bcheck);
        
        //set visualization
        ltitle.setBounds(60,10,120,20);
        lname.setBounds(10,30,120,20);
        fname.setBounds(80,30,120,20);
        lnim.setBounds(10,60,120,20);
        fnim.setBounds(80,60,120,20);
        li.setBounds(10,90,150,20);
        rad.setBounds(150,90,150,20);
        rwd.setBounds(150,120,120,20);
        ltest.setBounds(10,150,300,20);
        lwe.setBounds(50,180,120,20);
        fwe.setBounds(180,180,120,20);
        lct.setBounds(50,210,140,20);
        fct.setBounds(180,210,120,20);
        lit.setBounds(50,240,140,20);
        fit.setBounds(180,240,120,20);
        bcheck.setBounds(100,290,120,20);
               
    }
    
    //setter and getter

    public JLabel getLtitle() {
        return ltitle;
    }

    public void setLtitle(JLabel ltitle) {
        this.ltitle = ltitle;
    }

    public JLabel getLname() {
        return lname;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public JTextField getFname() {
        return fname;
    }

    public void setFname(JTextField fname) {
        this.fname = fname;
    }

    public JLabel getLnim() {
        return lnim;
    }

    public void setLnim(JLabel lnim) {
        this.lnim = lnim;
    }

    public JTextField getFnim() {
        return fnim;
    }

    public void setFnim(JTextField fnim) {
        this.fnim = fnim;
    }

    public JLabel getLi() {
        return li;
    }

    public void setLi(JLabel li) {
        this.li = li;
    }

    public JRadioButton getRad() {
        return rad;
    }

    public void setRad(JRadioButton rad) {
        this.rad = rad;
    }

    public JRadioButton getRwd() {
        return rwd;
    }

    public void setRwd(JRadioButton rwd) {
        this.rwd = rwd;
    }

    public JLabel getLtest() {
        return ltest;
    }

    public void setLtest(JLabel ltest) {
        this.ltest = ltest;
    }

    public JLabel getLwe() {
        return lwe;
    }

    public void setLwe(JLabel lwe) {
        this.lwe = lwe;
    }

    public JTextField getFwe() {
        return fwe;
    }

    public void setFwe(JTextField fwe) {
        this.fwe = fwe;
    }

    public JLabel getLct() {
        return lct;
    }

    public void setLct(JLabel lct) {
        this.lct = lct;
    }

    public JTextField getFct() {
        return fct;
    }

    public void setFct(JTextField fct) {
        this.fct = fct;
    }

    public JLabel getLit() {
        return lit;
    }

    public void setLit(JLabel lit) {
        this.lit = lit;
    }

    public JTextField getFit() {
        return fit;
    }

    public void setFit(JTextField fit) {
        this.fit = fit;
    }

    public JButton getBcheck() {
        return bcheck;
    }

    public void setBcheck(JButton bcheck) {
        this.bcheck = bcheck;
    }
    
    
}
