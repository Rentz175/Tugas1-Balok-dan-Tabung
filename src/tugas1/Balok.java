/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
public class Balok extends PersegiPanjang{
    int tinggi;
    
    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }
    
    public double hitungLuasBalok(){
        double luasTabung = 2*super.hitungLuas() + 2*(panjang*tinggi) + 2*(lebar*tinggi);
        return luasTabung;
    }
    
    public double hitungVolumeBalok(){
        double volumeBalok = super.hitungLuas()*tinggi;
        return volumeBalok;
    }
}
