/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawan1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Karyawan1> karyawanList = new ArrayList<>();

        while (true) {
            System.out.print("Masukkan nama karyawan: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan usia karyawan: ");
            int usia = Integer.parseInt(scanner.nextLine());

            System.out.print("Masukkan posisi karyawan: ");
            String posisi = scanner.nextLine();

            System.out.print("Masukkan jenis karyawan (Tetap/Kontrak): ");
            String jenis = scanner.nextLine();

            if (jenis.equalsIgnoreCase("Tetap")) {
                System.out.print("Masukkan gaji bulanan: ");
                double gajiBulanan = Double.parseDouble(scanner.nextLine());
                karyawanList.add(new KaryawanTetap(nama, usia, posisi, gajiBulanan));
            } else if (jenis.equalsIgnoreCase("Kontrak")) {
                System.out.print("Masukkan upah per jam: ");
                double upahPerJam = Double.parseDouble(scanner.nextLine());
                
                System.out.print("Masukkan jumlah jam kerja: ");
                int jumlahJamKerja = Integer.parseInt(scanner.nextLine());
                
                karyawanList.add(new KaryawanKontrak(nama, usia, posisi, upahPerJam, jumlahJamKerja));
            } else {
                System.out.println("Jenis karyawan tidak valid.");
            }

            System.out.print("Apakah Anda ingin menambah karyawan lagi? (ya/tidak): ");
            String lagi = scanner.nextLine();
            if (lagi.equalsIgnoreCase("tidak")) {
                break;
            }
        }

        System.out.println("\nData Karyawan:");
        for (Karyawan1 karyawan : karyawanList) {
            karyawan.tampilkanData();
            System.out.println();
        }

        scanner.close();
    }
}
