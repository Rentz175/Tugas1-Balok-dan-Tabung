/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author Febrian
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        PersegiPanjang pp = new PersegiPanjang(6,12);
//       
//        System.out.println("Luas Persegi Panjang = " + pp.hitungLuas());
//        System.out.println("Keliling Persegi Panjang = " + pp.hitungKeliling());
//        
//        Lingkaran o = new Lingkaran(10);
//        System.out.println("Luas Lingkaran = " + o.hitungLuas());
//        System.out.println("Keliling Lingkaran = " + o.hitungKeliling());
        
        Balok bl = new Balok(6, 6, 12 );
        System.out.println("Luas Persegi Panjang = " + bl.hitungLuas());
        System.out.println("Volume Balok = " + bl.hitungVolumeBalok());
        System.out.println("Luas Permukaan Balok = " + bl.hitungLuasBalok());
        
        Tabung tb = new Tabung(10,10);
        System.out.println("Volume Tabung = " + tb.hitungVolumeTabung());
        System.out.println("Luas Permukaan Tabung = " + tb.hitungLuasTabung());
    }
    
}
