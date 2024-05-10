/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
        System.out.println("Masukkan nama Mahasiswa :");
        String name = scanner.nextLine();
        
        System.out.println("Masukkan NIM Mahasiswa :");
        long nim = scanner.nextLong();
//        scanner.nextLine();
        
        System.out.println("Masukkan Jurusan mahasiswa :");
        String Jurusan = scanner.nextLine();
        
        System.out.println("Masukkan alamat rumah mahasiswa :");
        String alamat = scanner.nextLine();
        
        Mahasiswa mahasiswa=new Mahasiswa(name, nim, Jurusan, alamat);
        
        System.out.println("\nStudent Data");
        mahasiswa.Allinfo();
    }
    
}
