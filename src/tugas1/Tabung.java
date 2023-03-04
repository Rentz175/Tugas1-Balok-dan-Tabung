/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
//pada tabung menngunakan encapulation untuk menghitung meanfaatkan seter dan geter 
//sebenarnya lebih praktis pakai extend :v (memenuhi kewajiban tugas)
public class Tabung implements BangunRuang {
    int tinggi;
    
    Lingkaran li = new Lingkaran(); //instansiasi

    //constructor
    public Tabung(int tinggi, int jarijari) { //menggunakan metode get() dan set() untuk mengakses
        li.jarijari(jarijari);//<--set()
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {  
        double luasTabung = 2*li.hitungLuas()+(li.hitungKeliling()*tinggi);//<--get()
        return luasTabung;
    }

    @Override
    public double hitungVolume() {
        double volumeTabung = li.hitungLuas()*tinggi;//<--get()
        return volumeTabung;
    }

    
}
