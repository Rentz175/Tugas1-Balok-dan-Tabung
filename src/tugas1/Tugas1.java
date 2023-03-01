/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Febrian
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int menu;
        char ulang;
        int panjang, lebar, tinggi, jarijari;
        
        do {
            System.out.println("==========");
            System.out.println("MENU UTAMA");
            System.out.println("==========");
            System.out.println("1.Hitung Balok");
            System.out.println("2.Hitung Tabung");
            System.out.println("0.Exit");
            System.out.print("Pilih : ");
            menu = input.nextInt();
            
            System.out.println("============");
            
            switch (menu) {
                case 1:
                    System.out.println("Hitung Balok");
                    System.out.println("------------");
                    System.out.print("Input Panjang : ");
                    panjang = input.nextInt();
                    System.out.print("Input Lebar   : ");
                    lebar = input.nextInt();
                    System.out.print("Input Tinggi  : ");
                    tinggi = input.nextInt();
                    
                    Balok bl = new Balok(tinggi, panjang, lebar);
                    
                    System.out.println("========");
                    System.out.println("Hasil : ");
                    System.out.println("--------");
                    System.out.println("Luas Persegi Panjang    = " + bl.hitungLuas());
                    System.out.println("Keliling Persegi Panjang= " + bl.hitungKeliling());
                    System.out.println("Volume Balok            = " + bl.hitungVolumeBalok());
                    System.out.println("Luas Permukaan Balok    = " + bl.hitungLuasBalok());
                    break;
                    
                case 2: 
                    System.out.println("Hitung Tabung");
                    System.out.println("-------------");
                    System.out.print("Input Jari-Jari : ");
                    jarijari = input.nextInt();
                    System.out.print("Input Tinggi    : ");
                    tinggi = input.nextInt();
                    
                    Tabung tb = new Tabung(tinggi,jarijari);
                    
                    System.out.println("========");
                    System.out.println("Hasil : ");
                    System.out.println("--------");
                    System.out.println("Luas Lingkaran        = " + tb.hitungLuas());
                    System.out.println("Keliling Lingkaran    = " + tb.hitungKeliling());
                    System.out.println("Volume Tabung         = " + tb.hitungVolumeTabung());
                    System.out.println("Luas Permukaan Tabung = " + tb.hitungLuasTabung());
                    break;
                case 0:
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Menu Tidak Ada");
            }
            System.out.println("===============");
            System.out.print("Kembali? (y/n) : ");
            ulang = input.next().charAt(0);
            
        } while (ulang != 'n');
       
    }
    
}
