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
    private int jari;

    
    
    public int jarijari(){//geter
        return jari;
    }
    
    public void jarijari(int newjarijari){// <-- seter
        this.jari = newjarijari;
    }

    @Override
    public double hitungLuas() {
        double luas = Math.PI*jari*jari;
        return luas;
        
    }

    @Override
    public double hitungKeliling() {
        double keliling = Math.PI*jari*2;
        return keliling;
    }
    
    
}
