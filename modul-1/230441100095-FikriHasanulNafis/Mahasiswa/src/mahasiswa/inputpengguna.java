
package mahasiswa;
import java.util.Scanner;
public class inputpengguna {
    public static void main(String[] args) {
      mahasiswa mhs = new mahasiswa();
      Scanner input = new Scanner(System.in);
    
      
        System.out.print("Masukkan Nama :");
        mhs.nama = input.nextLine();
        System.out.print("Masukkan NIM:");
        mhs.nim = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan ALamat:");
        mhs.alamat = input.nextLine();
        System.out.print("Masukkan prodi:");
        mhs.prodi = input.nextLine();
        
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama: " + mhs.nama);
        System.out.println("NIM: " + mhs.nim);
        System.out.println("Jurusan/Prodi: " + mhs.prodi);
        System.out.println("Alamat: " + mhs.alamat);
        
    }
}