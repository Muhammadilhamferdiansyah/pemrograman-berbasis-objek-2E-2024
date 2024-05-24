/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan1;

abstract class Karyawan1 {
    protected String nama;
    protected int usia;
    protected String posisi;

    public Karyawan1(String nama, int usia, String posisi) {
        this.nama = nama;
        this.usia = usia;
        this.posisi = posisi;
    }

    public abstract void tampilkanData();
}
