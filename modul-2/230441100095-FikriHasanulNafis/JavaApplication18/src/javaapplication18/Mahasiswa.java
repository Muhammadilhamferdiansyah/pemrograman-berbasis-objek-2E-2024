
package javaapplication18;
public class Mahasiswa  {
    private static String nim;
    private static String nama;
    private static String Alamat;
    private static String Jurusan;

    public void Mahasiswa(String nim,String nama,String Alamat,String Jurusan){
        
        this.nim = nim;
        this.nama = nama;
        this.Alamat = Alamat;
        this.Jurusan = Jurusan;
        
    }
    public static String getNim() {
        return nim;
    }

    public static void setNim(String nim) {
        Mahasiswa.nim = nim;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Mahasiswa.nama = nama;
    }

    public static String getAlamat() {
        return Alamat;
    }

    public static void setAlamat(String Alamat) {
        Mahasiswa.Alamat = Alamat;
    }

    public static String getJurusan() {
        return Jurusan;
    }

    public static void setJurusan(String Jurusan) {
        Mahasiswa.Jurusan = Jurusan;
    }
    
    
}
