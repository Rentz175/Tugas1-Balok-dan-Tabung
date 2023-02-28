/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
public class Lingkaran implements BangunDatar {
    int jarijari;

    public Lingkaran(int jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double hitungLuas() {
        double luas = Math.PI*jarijari*jarijari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = Math.PI*jarijari*2;
        return keliling;
    }
    
    
}
