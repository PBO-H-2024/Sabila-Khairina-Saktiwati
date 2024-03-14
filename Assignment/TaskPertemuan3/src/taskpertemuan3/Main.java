/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskpertemuan3;
import java.util.Scanner;
import BangunDatar.Lingkaran;
import BangunDatar.Segitiga;
import BangunRuang.Tabung;
import BangunRuang.LimasSegitiga;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String backmenu;
       
        do{
        System.out.println(" Menu ");
        System.out.println(" 1. Tabung");
        System.out.println(" 2. Limas Segitiga");
        System.out.println(" 3. Exit");
        System.out.print(" Choose Menu : ");
        int menu = scanner.nextInt();

        switch(menu) {
            case 1:
                System.out.println(" Menu Tabung");
                System.out.println(" Input Nilai :");
                System.out.println("  Jari-Jari Lingkaran : ");
                double jari = scanner.nextDouble();
                System.out.println("  Tinggi Tabung : ");
                double tinggit = scanner.nextDouble();
                System.out.println(" Hasil Perhitungan");
                
                Lingkaran lin=new Lingkaran(jari);
                Tabung tab=new Tabung(jari,tinggit);
                System.out.println(" a. Keliling Lingkaran : "+lin.Keliling());
                System.out.println(" b. Luas Lingkaran : "+lin.Luas());
                System.out.println(" c. Volume Tabung :"+tab.Volume());
                System.out.println(" d. Luas Permukaan Tabung :"+ tab.LuasPermukaan());
                break;
                
            case 2:
                System.out.println(" Menu Limas Segitiga");
                System.out.println(" Input Nilai :");
                System.out.println("  Sisi 1 Segitiga  : ");
                double sisia = scanner.nextDouble();
                System.out.println("  Sisi 2 Segitiga : ");
                double sisib = scanner.nextDouble();
                System.out.println("  Sisi 3 Segitiga : ");
                double sisic = scanner.nextDouble();
                System.out.println("  Tinggi Limas : ");
                double tinggil = scanner.nextDouble();
                
                Segitiga seg=new Segitiga(sisia,sisib,sisic);
                LimasSegitiga lis=new LimasSegitiga(sisia,sisib,sisic,tinggil);
                System.out.println(" a. Keliling Segitiga : "+seg.Keliling());
                System.out.println(" b. Luas Segitiga : "+seg.Luas());
                System.out.println(" c. Volume Limas Segitiga : "+lis.Volume());
                System.out.println(" d. Luas Permukaan Limas Segitiga : "+lis.LuasPermukaan());
                break;
                
            case 3:
                System.exit(0);
                break;
                
            default:
                System.out.println(" Menu is Not Available");
                break;
        }
        System.out.println(" Back to Menu? (y/n) : ");
        backmenu = scanner.next();
        } while(backmenu.equals("y"));
        scanner.close();
    }
}

