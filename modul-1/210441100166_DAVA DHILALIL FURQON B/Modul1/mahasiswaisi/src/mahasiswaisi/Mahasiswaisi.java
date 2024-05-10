package mahasiswaisi;
import java.util.Scanner;
public class Mahasiswaisi {
    String Nama, Nim, Prodi, Alamat;
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        Mahasiswaisi isi = new Mahasiswaisi();
        System.out.println("Masukkan Nama       :");
        isi.Nama = inpt.nextLine();
        System.out.println("Masukkan NIM        :");
        isi.Nim = inpt.nextLine();
        System.out.println("Masukkan Prodi      :");
        isi.Prodi = inpt.nextLine();
        System.out.println("Masukkan Alamat      :");
        isi.Alamat = inpt.nextLine();         
        System.out.println("====================================================");
        System.out.println("Nama        : "+isi.Nama);
        System.out.println("NIM         : "+isi.Nim);
        System.out.println("Prodi       : "+isi.Prodi);
        System.out.println("Alamat      : "+isi.Alamat);
    }    
}
   
