/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplikasidatamahasiswa;
import java.util.Scanner;
/**
 *
 * @author ahmad
 */
public class AplikasiDataMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner data = new Scanner(System.in)) {
            String loop;
            System.out.println("===================================");
            System.out.println("        APLIKASI DATA MAHASISWA    ");
            System.out.println("===================================");
            System.out.print("Masukkan Nama Universitas: ");
            Universitas.setNamaUniversitas(data.nextLine());
            
            do {
                System.out.println("\n-----------------------------------");
                System.out.println("      Masukkan Data Mahasiswa    ");
                System.out.println("-----------------------------------");
                System.out.print("NIM: ");
                String nim = data.next();
                System.out.print("Nama: ");
                String nama = data.next();
                data.nextLine(); // Mengonsumsi newline
                System.out.print("Alamat: ");
                String alamat = data.nextLine();
                System.out.println("Jurusan:");
                System.out.println("41. TEKNIK INFORMATIKA");
                System.out.println("42. TEKNIK INDUSTRI");
                System.out.println("43. TEKNIK ELEKTRO");
                System.out.println("44. SISTEM INFORMASI");
                System.out.println("45. TEKNIK MESIN");
                System.out.println("46. TEKNIK MEKATRONIKA");
                System.out.print("Pilih Jurusan (41-46): ");
                int jurusan = data.nextInt();
                System.out.println("===========================");
                
                // Membuat objek Mahasiswa
                Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
                
                // Menampilkan data mahasiswa
                System.out.println("\nData Mahasiswa:");
                mahasiswa.displayData();
                
                // Meminta input untuk memasukkan data lagi atau tidak
                System.out.print("\nApakah Anda ingin memasukkan data lagi? (Y/T): ");
                loop = data.next();
            } while (loop.equalsIgnoreCase("Y"));
            System.out.println("===================================");
            System.out.println("            PROGRAM SELESAI        ");
            System.out.println("===================================");
        }

    }
}
