/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

import java.util.Scanner;


/**
 *
 * @author Ivan Aditama
 */
public class DataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Pendeklasian      
        String nama, prodi, alamat;
        long nim;
       
//       Membuat objek mhs untuk meminta input
       Scanner mhs = new Scanner(System.in);
       
        System.out.println("Masukkan data anda");
        System.out.println("Masukkan nama : ");
        nama = mhs.nextLine();
        System.out.println("Masukkan prodi : ");
        prodi = mhs.nextLine();
        System.out.println("Masukkan alamat : ");
        alamat = mhs.nextLine();
        System.out.println("Masukkan NIM : ");
        nim = mhs.nextLong();
        
        System.out.println("--------------------------------------------------");
        System.out.println("Nama Mahasiswa : "+nama);
        System.out.println("NIM : "+nim);
        System.out.println("Prodi/Jurusan : "+prodi);
        System.out.println("Alamat : "+alamat);
    }
    
}
