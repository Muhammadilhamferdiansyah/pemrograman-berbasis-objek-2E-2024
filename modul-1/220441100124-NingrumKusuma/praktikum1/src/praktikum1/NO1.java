/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

/**
 *
 * @author ningrum
 */
public class NO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia d = new Manusia ();
        d.nama =" Jennie ";
        d.alamat =" Jakarta";
        d.umur =25;
        
        System.out.println("Nama :" + d.nama);
        System.out.println("Alamat :" + d.alamat);
        System.out.println("Umur :" + d.umur);
        
        d.berjalan ();
        
        System.out.println("===============");
        
        
        Manusia v = new Manusia ();
        v.nama =" V ";
        v.alamat =" Bandung ";
        v.umur =26;
        
        System.out.println("Nama :" + v.nama);
        System.out.println("Alamat :" + v.alamat);
        System.out.println("Umur :" + v.umur);
        
        v.berlari();
       
    }
    
}
