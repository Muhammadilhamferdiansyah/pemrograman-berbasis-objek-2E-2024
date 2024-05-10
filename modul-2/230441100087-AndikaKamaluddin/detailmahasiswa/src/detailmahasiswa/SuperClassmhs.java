/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package detailmahasiswa;

/**
 *
 * @author USEr
 */
public class SuperClassmhs {
     // Instance dari variable
    protected long nim;
    protected String nama;
    protected String alamat;
    protected String jurusan;

    // Constructor
    public SuperClassmhs(long nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    // Getter and setter methods
    public long getNim() {
        return nim;
    }

    public void setNim(long nim) {
        this.nim = nim;
    }

    public String getnama() {
        return nama;
    }

    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getalamat() {
        return alamat;
    }

    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getjurusan() {
        return jurusan;
    }

    public void setjurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    // Method untuk mengoutputkan data yang sudah diinput user
    public void displaydata() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jurusan: " + jurusan);
    }
}
