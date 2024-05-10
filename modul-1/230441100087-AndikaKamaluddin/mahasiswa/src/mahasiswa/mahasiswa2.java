/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mahasiswa;

/**
 *
 * @author USEr
 */
public class mahasiswa2 {
    String nama;
    String jurusan;
    String alamat;
    long nim;
    
    public mahasiswa2(String inputnama, long inputnim, String inputjurusan, String inputalamat){
        nama = inputnama;
        nim = inputnim;
        jurusan = inputjurusan;
        alamat = inputalamat;
    }
    
    public void datamahasiswa(){
        System.out.println("Nama :"+nama);
        System.out.println("NIM :"+nim);
        System.out.println("Jurusan :"+jurusan);
        System.out.println("Alamat :"+alamat);
    }
}
