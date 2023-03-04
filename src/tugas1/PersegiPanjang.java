/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
public class PersegiPanjang implements BangunDatar{//implement
    int panjang, lebar;

    //constructor
    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        double luas = panjang*lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double keliling = 2*(panjang + lebar);
        return keliling;
    }
        
    
}
