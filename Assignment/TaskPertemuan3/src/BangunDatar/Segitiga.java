/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author LENOVO
 */
public class Segitiga implements HitungBangunDatar{
    //attribute
    double sisia,sisib,sisic;
    
    //constructor
    public Segitiga (double sa,double sb, double sc){
        this.sisia=sa;
        this.sisib=sb;
        this.sisic=sc;
    }
    
    //setter and getter

    public double getSisia() {
        return sisia;
    }

    public void setSisia(double sisia) {
        this.sisia = sisia;
    }

    public double getSisib() {
        return sisib;
    }

    public void setSisib(double sisib) {
        this.sisib = sisib;
    }

    public double getSisic() {
        return sisic;
    }

    public void setSisic(double sisic) {
        this.sisic = sisic;
    }

    
    //method
    @Override
    public double Luas() {
        double s=(sisia+sisib+sisic)/2;
        return Math.sqrt(s*(s-sisia)*(s-sisib)*(s-sisic));
    }

    @Override
    public double Keliling() {
        return sisia+sisib+sisic;
    }
    
    
}
