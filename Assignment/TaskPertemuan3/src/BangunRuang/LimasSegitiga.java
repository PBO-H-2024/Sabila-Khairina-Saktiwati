/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;
import BangunDatar.Segitiga;

/**
 *
 * @author LENOVO
 */
public class LimasSegitiga extends Segitiga implements HitungBangunRuang{
    //attribute
    double tinggilimas;
    
    //constructor
    public LimasSegitiga(double sa,double sb, double sc,double tl){
        super(sa,sb,sc);
        this.tinggilimas=tl;
    }
    
    //method
    @Override
    public double Volume() {
        return (super.Luas()*tinggilimas)/3;
    }

    @Override
    public double LuasPermukaan() {
        return super.Luas()+((super.getSisia()*tinggilimas)/2)+((super.getSisia()*tinggilimas)/2)+((super.getSisib()*tinggilimas)/2);
    }
    
}
