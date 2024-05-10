package modul1_tugas2;
import java.util.Scanner;

public class Modul1_tugas2 {
    public static void main(String[] args) {
        String nama,alamat,prodi;
        long nim;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Anda \t: ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat Anda \t: ");
        alamat = input.nextLine();
        System.out.print("Masukkan Prodi Anda \t: ");
        prodi = input.nextLine();
        System.out.print("Masukkan Nim Anda \t: ");
        nim = input.nextLong();
        
        input.nextLine();
        System.out.println("nama anda adalah " + nama + " anda berasal dari " + alamat + " program studi anda adalah " + prodi + " dan nim anda " + nim);
    }
    
}
