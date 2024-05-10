package mhs;
class mahasiswa {
    String Nama;
    String Nim;
    String Prodi;
    String Alamat;
    //method nama
    void nama_mahasiswa(){
        System.out.println("Nama        :" +Nama);
    }
    //method nim
    void nim_mahasiswa(){
        System.out.println("NIM         :" +Nim);
    }
    //method prodi
    void prodi_mahasiswa(){
        System.out.println("Prodi       :" +Prodi);
    }
    //method alamat
    void alamat_mahasiswa(){
        System.out.println("Alamat      :" +Alamat);
    }
}
public class Mhs {
    public static void main(String[] args) {
        mahasiswa satu= new mahasiswa();
        satu.Nama=" Dava Dhilalil Furqon Baihaqi";
        satu.nama_mahasiswa();
        satu.Nim=" 210441100166";
        satu.nim_mahasiswa();
        satu.Prodi=" Sistem Informasi";
        satu.prodi_mahasiswa();
        satu.Alamat=" lamongan";
        satu.alamat_mahasiswa();
    }
}
