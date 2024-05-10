package javaapplication18;
import java.util.Scanner;
public class datamahasiswa {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner inputjurusan = new Scanner(System.in);
        String ulang;
        do {
            System.out.print("Masukkan Universitas:");
            Universitas.setNamaUniversitas(input.nextLine());
            System.out.print("Masukkan nim: ");
            Mahasiswa.setNim(input.nextLine());
            System.out.print("Masukkan nama:");
            Mahasiswa.setNama(input.nextLine());
            System.out.print("Masukkan alamat:");
            Mahasiswa.setAlamat(input.nextLine());
            System.out.println("Jurusan");
            System.out.println("41. Teknik Informatika");
            System.out.println("42. Teknik Industri");
            System.out.println("43. Teknik Elektro");  
            System.out.println("44. Sistem Informasi");
            System.out.println("48. Teknik Mesin");
            System.out.println("49. Teknik Mekatronika");
            System.out.println("Pilih Jurusan: ");
            int pilihjur;
            pilihjur = inputjurusan.nextInt();
            switch (pilihjur) {
                case 41:
                    Mahasiswa.setJurusan("Teknik Informatika");
                    break;
                case 42:
                    Mahasiswa.setJurusan("Teknik Industri");
                    break;
                case 43:
                    Mahasiswa.setJurusan("Teknik Elektro");
                    break;
                case 44:
                    Mahasiswa.setJurusan("Sistem Informasi");
                    break;
                case 48:
                    Mahasiswa.setJurusan("Teknik Mesin");
                    break;
                case 49:
                    Mahasiswa.setJurusan("Teknik Mekatronika");
                    break;
                default:
                    Mahasiswa.setJurusan("Pilihan tidak tersedia");
                    break;
            }

            System.out.println("Data Mahasiswa");
            System.out.println("Universitas: "+Universitas.getNamaUniversitas());
            System.out.println("Nim        : "+Mahasiswa.getNim());
            System.out.println("Nama       : "+Mahasiswa.getNama());
            System.out.println("Alamat     : "+Mahasiswa.getAlamat());
            System.out.println("Jurusan    : "+Mahasiswa.getJurusan());
            
            System.out.print("Input Lagi (Y/T)? ");
            ulang = input.nextLine();
        }
        while (ulang.equalsIgnoreCase("Y"));
            System.out.println("Terima Kasih!");
    }     
}
