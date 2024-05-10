/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;
/**
 *
 * @author USEr
 */
public class Mahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Nama Mahasiswa :");
        String nama=scanner.nextLine();
        
        System.out.println("NIM Mahasiswa :");
        long nim=scanner.nextLong();
        scanner.nextLine();
        
        System.out.println("Jurusan Mahasiswa :");
        String jurusan=scanner.nextLine();
        
        System.out.println("Alamat Mahasiswa :");
        String alamat=scanner.nextLine();
        
        mahasiswa2 mahasiswa=new mahasiswa2(nama,nim,jurusan,alamat);
        System.out.println("Detail Info");
        mahasiswa.datamahasiswa();
    }
    
}
