/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
public class Tabung extends Lingkaran{
    int tinggi;

    public Tabung(int tinggi, int jarijari) {
        super(jarijari);
        this.tinggi = tinggi;
    }
    
    public double hitungLuasTabung(){
        double luasTabung = super.hitungKeliling()*(jarijari + tinggi);
        return luasTabung;
    }
    
    public double hitungVolumeTabung(){
        double volumeTabung = super.hitungLuas()*tinggi;
        return volumeTabung;
    }

    
}
