/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {
    String Nama;
    long NIM;
    String Jurusan;
    String Alamat;
    
    public Mahasiswa(String inputNama, long inputNIM, String inputJurusan, String inputAlamat){
        //menyimpan data yg sudah diinputkan agar bisa outputkan kembali
        Nama = inputNama;
        NIM = inputNIM;
        Jurusan = inputJurusan;
        Alamat = inputAlamat;
    }
    public void Allinfo(){
        System.out.println("Nama :"+Nama);
        System.out.println("NIM :"+NIM);
        System.out.println("Jurusan :"+Jurusan);
        System.out.println("Alamat :"+Alamat);
    }
}
