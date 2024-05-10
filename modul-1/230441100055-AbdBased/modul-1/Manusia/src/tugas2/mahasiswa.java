/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author AbasZ
 */
public class mahasiswa {
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        String Nama;
        String Nim;
        String Prodi;
        String Alamat;
        
        System.out.println("Masukkan Nama Anda :");
        Nama = input.nextLine();
        System.out.println("Masukkan Nim Anda :");
        Nim = input.nextLine();
        System.out.println("Masukkan Prodi Anda :");
        Prodi = input.nextLine();
        System.out.println("Masukkan Alamat Anda :");
        Alamat = input.nextLine();
        
        
        System.out.println("----------------------------------------");
        System.out.println("Nama Mahasiswa      : "+Nama);
        System.out.println("Nim Mahasiswa       : "+Nim);
        System.out.println("Prodi Mahasiswa     : "+Prodi);
        System.out.println("Alamat Mahasiswa    : "+Alamat);
    }  
}
