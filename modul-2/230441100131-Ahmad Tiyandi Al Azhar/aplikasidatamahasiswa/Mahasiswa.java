/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasidatamahasiswa;

/**
 *
 * @author ahmad
 */
class Mahasiswa extends Universitas{
    String nim;
    String nama;
    String alamat;
    int jurusan;

    Mahasiswa(String nim, String nama, String alamat, int jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    void displayData() {
        System.out.println("nama univ: "+ getNamaUniversitas());
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + getNamaJurusan());
    }

    private String getNamaJurusan() {
        return switch (jurusan) {
            case 41 -> "TEKNIK INFORMATIKA";
            case 42 -> "TEKNIK INDUSTRI";
            case 43 -> "TEKNIK ELEKTRO";
            case 44 -> "SISTEM INFORMASI";
            case 45 -> "TEKNIK MESIN";
            case 46 -> "TEKNIK MEKATRONIKA";
            default -> "Tidak Valid";
        };
    }
}