/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mahasiswa;
import java.util.Scanner;

public class Mahasiswa {

    // Variabel anggota
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;

    // untuk inisialisasi objek Mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
    }

    // Kelas utama untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan informasi mahasiswa
        System.out.println("Masukkan informasi mahasiswa:");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        // Membuat objek Mahasiswa berdasarkan informasi yang dimasukkan pengguna
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, jurusan, alamat);

        // Menampilkan informasi mahasiswa
        System.out.println("\nInformasi Mahasiswa:");
        mahasiswa.tampilkanInfo();

        // Menutup objek scanner
        input.close();
    }
}
