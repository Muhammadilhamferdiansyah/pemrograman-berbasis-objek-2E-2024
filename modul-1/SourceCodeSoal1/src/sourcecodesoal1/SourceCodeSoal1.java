/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sourcecodesoal1;

/**
 *
 * @author Chusnul Yakin
 */

public class SourceCodeSoal1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        manusia orang3 = new manusia();
        manusia orang4 = new manusia();
        
        // Mencetak Atribut Pada Objek orang1
        orang1.nama = "Yakin";
        orang1.umur = 20;
        orang1.alamat = "Surabaya";
        System.out.println("Nama orang 1 adalah " + orang1.nama);
        System.out.println("Umur objek 1 adalah " + orang1.umur + " tahun");
        System.out.println ("Alamat objek 1 adalah Kota " + orang1.alamat);
        System.out.println ("");
        
        // Mencetak Atribut Pada Objek orang2
        orang2.nama="Tio";
        orang2.umur= 19;
        orang2.alamat= "Bangkalan";
        System.out.println("Nama objek 2 adalah " + orang2.nama);
        System.out.println("Umur objek 2 adalah " + orang2.umur + " Tahun");
        System.out.println ("Alamat objek 2 adalah Kota " + orang2.alamat);
        System.out.println ("");
        
        // Mencetak Atribut Pada Objek orang3
        orang3.nama="Fikri";
        orang3.umur= 21;
        orang3.alamat= "Surabaya";
        System.out.println ("Nama objek 3 adalah " + orang3.nama);
        System.out.println ("Umur objek 3 adalah " + orang3.umur + " Tahun");
        System.out.println ("Alamat objek 3 adalah Kota " + orang3.alamat);
        System.out.println ("");
        
        // Mencetak Atribut Pada Objek orang4
        orang4.nama="Muchlis";
        orang4.umur= 19;
        orang4.alamat= "Bangkalan";
        System.out.println ("Nama objek 4 adalah " + orang4.nama);
        System.out.println ("Umur objek 4 adalah " + orang4.umur + " Tahun");
        System.out.println ("Alamat objek 4 adalah Kota " + orang4.alamat);
        System.out.println ("");
        
        // Memanggil Method Pada Object orang1, orang2, orang3, & orang 4
        orang1.berlari();
        orang2.berjalan();
        orang3.MengerjakanTugas();
        orang4.MembacaBuku();
}
}
