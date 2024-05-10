/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cobapart1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class CobaPart1 {

    /**
     * @param args the command line arguments
     */

    private static String namaUniversitas;
    private static String nim;
    private static String namaMahasiswa;
    private static String alamat;
    private static int kodeJurusan;
    
    public CobaPart1(String namaUniversitas, String nim, String namaMahasiswa, String alamat, int kodeJurusan) {
    this.namaUniversitas = namaUniversitas;
    this.nim = nim;
    this.namaMahasiswa = namaMahasiswa;
    this.alamat = alamat;
    this.kodeJurusan = kodeJurusan;
    }

    // Setter untuk Nama Universitas
    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    // Getter untuk Nama Universitas
    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    // Setter untuk NIM
    public static void setNim(String nim) {
        CobaPart1.nim = nim;
    }

    // Getter untuk NIM
    public static String getNim() {
        return nim;
    }

    // Setter untuk Nama Mahasiswa
    public static void setNamaMahasiswa(String nama) {
        namaMahasiswa = nama;
    }

    // Getter untuk Nama Mahasiswa
    public static String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    // Setter untuk Alamat
    public static void setAlamat(String alamat) {
        CobaPart1.alamat = alamat;
    }

    // Getter untuk Alamat
    public static String getAlamat() {
        return alamat;
    }

    // Setter untuk Kode Jurusan
    public static void setKodeJurusan(int kode) {
        kodeJurusan = kode;
    }

    // Getter untuk Kode Jurusan
    public static int getKodeJurusan() {
        return kodeJurusan;
    }

    // Method untuk mendapatkan nama jurusan berdasarkan kode
    public static String getNamaJurusan() {
        switch (kodeJurusan) {
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42:
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 48:
                return "TEKNIK MESIN";
            case 49:
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak valid";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Set nama universitas
        System.out.print("Masukkan Nama Universitas : ");
        CobaPart1.setNamaUniversitas(scanner.nextLine());

        // Masukkan data mahasiswa
        System.out.print("Masukkan nim : ");
        CobaPart1.setNim(scanner.nextLine());
        
        System.out.print("Masukkan nama :");
        CobaPart1.setNamaMahasiswa(scanner.nextLine());
        
        System.out.print("Masukkan alamat :");
        CobaPart1.setAlamat(scanner.nextLine());
        
        System.out.print("Masukkan kode jurusan :");
        CobaPart1.setKodeJurusan(scanner.nextInt());

        // Tampilkan informasi mahasiswa
        System.out.println("Nama Universitas: " + CobaPart1.getNamaUniversitas());
        System.out.println("NIM : " + CobaPart1.getNim());
        System.out.println("Nama Mahasiswa : " + CobaPart1.getNamaMahasiswa());
        System.out.println("Alamat : " + CobaPart1.getAlamat());
        System.out.println("Kode Jurusan : " + CobaPart1.getKodeJurusan());
        System.out.println("Nama Jurusan : " + CobaPart1.getNamaJurusan());
    }
}
