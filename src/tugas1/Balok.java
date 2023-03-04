/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
//pada balok menngunakan extend(overide) untuk membantu menghitung
public class Balok extends PersegiPanjang implements BangunRuang{ //karena build pertama interface BngunRang.Java tidak terpakai
    int tinggi;                                                   //saya mencoba menambahkan implement dan berhasil :)
                                                                  //tidak tau benar atau salah hehe :)
    
    //constructor
    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasTabung = 2*super.hitungLuas() + 2*(panjang*tinggi) + 2*(lebar*tinggi);
        return luasTabung;
    }

    @Override
    public double hitungVolume() {
        double volumeBalok = super.hitungLuas()*tinggi;
        return volumeBalok;
    }
}
