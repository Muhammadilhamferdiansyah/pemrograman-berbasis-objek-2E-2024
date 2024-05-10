package apkdatamahasiswa;
//import ArrayList dan Scanner
import java.util.ArrayList;
import java.util.Scanner;

//main class
public class ApkDataMahasiswa {
    public static void main(String[] args) {
        
        //membuat objek input dan objek daftarMhs
        Scanner input = new Scanner(System.in);
        ArrayList<Mahasiswa> daftarMhs = new ArrayList<>();
        
        System.out.print("Masukkan Nama Universitas : ");
        
        //mengakses static method setter dari class Universitas
        Universitas.setNamaUniv(input.nextLine());
        System.out.println("");
        
        //input data mahasiswa
        while (true){
            System.out.println("Masukkan Data Mahasiswa");
            System.out.print("NIM : ");
            String nim = input.nextLine();
            System.out.print("NAMA : ");
            String nama = input.nextLine();
            System.out.print("ALAMAT : ");
            String alamat = input.nextLine();
            System.out.println("=== DAFTAR JURUSAN ===");
            System.out.println("41 = TEKNIK INFORMATIKA");
            System.out.println("42 = TEKNIK INDUSTRI");
            System.out.println("43 = TEKNIK ELEKTRO");
            System.out.println("44 = SISTEM INFORMASI");
            System.out.println("48 = TEKNIK MESIN");
            System.out.println("49 = TEKNIK MEKATRONIKA");
            System.out.print("JURUSAN (input angka) : ");
            int jurusan = input.nextInt();
            input.nextLine();
            
            //membuat objek mhs dari class Mahasiswa, serta memasaukkan parameter saat pembuatan objek
            Mahasiswa mhs = new Mahasiswa(nim, nama, alamat, jurusan);
            
            //menambahkan objek mhs ke dalam ArrayList
            daftarMhs.add(mhs);
            System.out.print("Apakah Anda ingin memasukkan data mahasiswa lagi (Y/T)? ");
            String lanjut = input.nextLine();
            if (lanjut.equalsIgnoreCase("T")){
                break;
            }
        }
        System.out.println("");
        
        //mengakses static method getter dari class Universitas
        System.out.println("===== Daftar mahasiswa di "+Universitas.getNamaUniv()+" =====");
        
        //menampilkan elemen dalam ArrayList menggunakan perulangan for-each
        for (Mahasiswa mhs : daftarMhs){
            
            //mengakses method getter dari objek mhs
            System.out.println("NIM     : "+mhs.getNim());
            System.out.println("NAMA    : "+mhs.getNama());
            System.out.println("ALAMAT  : "+mhs.getAlamat());
            System.out.println("JURUSAN : "+mhs.getJurusanStr());
            System.out.println("");
        }
    }
}
