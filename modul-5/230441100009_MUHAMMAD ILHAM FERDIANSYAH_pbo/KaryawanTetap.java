/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan1;

class KaryawanTetap extends Karyawan1 {
    private double gajiBulanan;

    public KaryawanTetap(String nama, int usia, String posisi, double gajiBulanan) {
        super(nama, usia, posisi);
        this.gajiBulanan = gajiBulanan;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia);
        System.out.println("Posisi: " + posisi);
        System.out.println("Status: Karyawan Tetap");
        System.out.println("Gaji Bulanan: " + gajiBulanan);
    }
}
