/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.util.Scanner;

public class Main {
    private static String universitas;

    public static void setUniversitas(String namaUniversitas) {
        universitas = namaUniversitas;
    }

    public static String getUniversitas() {
        return universitas;
    }

    public static void main(String[] args) {
        final int MAX_MAHASISWA = 100;
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[MAX_MAHASISWA];
        int indexMahasiswa = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Universitas: ");
        String namaUniversitas = scanner.nextLine();
        setUniversitas(namaUniversitas); 

        String[] jurusanPilihan = {
            "41-TEKNIK INFORMATIKA",
            "42-TEKNIK INDUSTRI",
            "43-TEKNIK ELEKTRO",
            "44-SISTEM INFORMASI",
            "45-TEKNIK MESIN",
            "46-TEKNIK MEKATRONIKA"
        };

        boolean lanjut = true;

        while (lanjut) {
            for (String jur : jurusanPilihan) {
                System.out.println(jur);
            }

            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Masukkan Jurusan: ");
            String jurusanInput = scanner.nextLine();

            int index = Integer.parseInt(jurusanInput.substring(0, 2)) - 41;
            String jurusanTampilan = jurusanPilihan[index].substring(3);

            Mahasiswa mhs = new MahasiswaS2(nim, nama, alamat, jurusanTampilan);
            daftarMahasiswa[indexMahasiswa] = mhs;
            indexMahasiswa++;

            System.out.print("Apakah ingin memasukkan data lagi? (Y/T): ");
            String jawaban = scanner.nextLine();
            lanjut = jawaban.equalsIgnoreCase("Y");
        }

        System.out.println("Universitas: " + getUniversitas());

        for (int i = 0; i < indexMahasiswa; i++) {
            Mahasiswa mahasiswa = daftarMahasiswa[i];
            System.out.println("=============================");
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("Alamat: " + mahasiswa.getAlamat());
            System.out.println("Jurusan: " + mahasiswa.getJurusan());
            System.out.println();
        }
    }
}