/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ASUS
 */
class Manusia {
    String nama;
    int umur;
    String alamat;
        public void berlari(){
        System.out.println("Objek ini " + this.nama + " berlari");
    }
        public void berjalan(){
        System.out.println("Objek ini " + this.nama + " berjalan");
    }
}
public class tugas1 {

    public static void main(String[] args) {

        Manusia orang1 = new Manusia();
        Manusia orang2 = new Manusia();
        
        orang1.nama = "Robi";
        orang1.umur = 18;
        orang1.alamat = "Bojonegoro";
        System.out.println("Nama Objek 1 adalah " + orang1.nama);
        System.out.println("Alamat Objek 1 adalah " + orang1.alamat);
        System.out.println("Umur Objek 1 adalah " + orang1.umur + " Tahun");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("Terimakasih");
        
        orang2.nama ="fito";
        orang2.umur =19;
        orang2.alamat = "Bojonegoro";
        System.out.println("Nama Objek 2 adalah " + orang2.nama);
        System.out.println("Alamat Objek 2 adalah " + orang2.alamat);
        System.out.println("Umur Objek 2 adalah " + orang2.umur + " Tahun");
        orang2.berjalan();
        orang2.berlari();
        System.out.println("Terimakasih");
    }
    
}