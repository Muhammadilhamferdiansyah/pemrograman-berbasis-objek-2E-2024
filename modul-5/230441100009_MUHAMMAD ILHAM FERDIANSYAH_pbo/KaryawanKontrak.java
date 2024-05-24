/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan1;

class KaryawanKontrak extends Karyawan1 {
    private double upahPerJam;
    private int jumlahJamKerja;

    public KaryawanKontrak(String nama, int usia, String posisi, double upahPerJam, int jumlahJamKerja) {
        super(nama, usia, posisi);
        this.upahPerJam = upahPerJam;
        this.jumlahJamKerja = jumlahJamKerja;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Status: Karyawan Kontrak");
        System.out.println("Upah Per Jam: " + upahPerJam);
        System.out.println("Jumlah Jam Kerja: " + jumlahJamKerja);
        System.out.println("Total Upah: " + (upahPerJam * jumlahJamKerja));
    }
}
