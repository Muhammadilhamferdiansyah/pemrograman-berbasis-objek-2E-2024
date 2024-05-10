/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobil;

/**
 *
 * @author ASUS
 */
public class Mobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mobilku mycar = new Mobilku();
        //mengisi atribut pada object mycar
        mycar.warna="pink";
        mycar.merk="ferrari";
        mycar.bentuk="persegi";
        mycar.tahun=2024;
        
        //mencetak atribut pada
        System.out.println("Warna mobil saya adalah :"+mycar.warna);
        System.out.println("Merk mobil saya adalah :"+mycar.merk);
        System.out.println("Bentuk mobil saya adalah :"+mycar.bentuk);
        System.out.println("Mobil saya keluaran tahun :"+mycar.tahun);
        
        //memanggil method pada object mycar
        mycar.melaju();
        mycar.membelok();
        mycar.mengerem();
        mycar.mengklakson();
    }
    
}
