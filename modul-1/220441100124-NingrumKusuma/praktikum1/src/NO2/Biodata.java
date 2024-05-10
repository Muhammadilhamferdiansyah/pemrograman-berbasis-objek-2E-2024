/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NO2;

import java.util.Scanner;

/**
 *
 * @author ningrum
 */
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner data = new Scanner
        (System.in);
        System.out.print("Nama : ");
        String nama = data.nextLine();
        System.out.print("NIM : ");
        String nim = data.nextLine();
        System.out.print("Prodi : ");
        String prodi = data.nextLine();
        System.out.print("Alamat : ");
        String alamat = data.nextLine();
        System.out.println("====================");
        System.out.println("Haloo "+nama);
        System.out.println("dengan Nim "+nim);
        System.out.println("Program Studi "+prodi);
        System.out.println("Alamatku di" + alamat);
   
    }
    
}
