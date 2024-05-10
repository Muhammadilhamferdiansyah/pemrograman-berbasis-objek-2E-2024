/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package detailmahasiswa;

import java.util.Scanner;

/**
 *
 * @author USEr
 */
public class Detailmahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            int count = 0;
            System.out.println("Input Nama Univ: ");
            String Univ = scanner.nextLine();
            SubClassUniv.setNamaUniv(Univ);
            
            while (true) {
                System.out.println("\nData Mahasiswa " + SubClassUniv.getNamaUniv() + ":");
                
                System.out.println("NIM: ");
                long nim = scanner.nextLong();
                scanner.nextLine();
                
                System.out.println("Nama: ");
                String nama = scanner.nextLine();
                
                System.out.println("Alamat: ");
                String alamat = scanner.nextLine();
                
                System.out.println("Pilihan Jurusan:");
                System.out.println("41. Teknik Informatika");
                System.out.println("42. Teknik Industri");
                System.out.println("43. Teknik Elektro");
                System.out.println("44. Sistem Informasi");
                System.out.println("48. Teknik Mesin");
                System.out.println("49. Teknik Mekatronika");
                System.out.println("Masukkan Kode Jurusan: ");
                
                int kodejur = Integer.parseInt(scanner.nextLine());
                String jurusan = getJurusanByKode(kodejur);
                
                SuperClassmhs alldata=new SuperClassmhs(nim, nama, alamat, jurusan);
                count++;
                
                System.out.println("\nData Mahasiswa ke-" + count + ":");
                alldata.displaydata();
                
                System.out.println("\nApakah Anda ingin menginput data lagi? (Yes/No): ");
                String pilih = scanner.nextLine();
                if (!pilih.equalsIgnoreCase("Yes")) {
                    break; 
                }
            }
        }
    }


    private static String getJurusanByKode(int kodejur) {
        return switch (kodejur) {
            case 41 -> "Teknik Informatika";
            case 42 -> "Teknik Industri";
            case 43 -> "Teknik Elektro";
            case 44 -> "Sistem Informasi";
            case 48 -> "Teknik Mesin";
            case 49 -> "Teknik Mekatronika";
            default -> "Kode Tidak Valid";
        };
    }
}
   
