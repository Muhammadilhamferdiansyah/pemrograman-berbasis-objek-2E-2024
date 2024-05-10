/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

/**
 *
 * @author AbasZ
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cirimanusia aldo = new cirimanusia();
        cirimanusia gupron = new cirimanusia();
        cirimanusia adit = new cirimanusia();
        
        // Mengisi atribut pada objek ciri1, ciri2, ciri3
        aldo.nama = "Aldo";
        aldo.umur = 19;
        aldo.alamat = "Sabenih";
        
        gupron.nama = "Gupron";
        gupron.umur = 20;
        gupron.alamat = "Galis";
        
        adit.nama = "Adit Ya";
        adit.umur = 19;
        adit.alamat = "Pocong";
        
        // Mencetak atribut pada objek ciri1
        System.out.println("Nama : "+aldo.nama);
        System.out.println("Umur : "+aldo.umur);
        System.out.println("Alamat : "+aldo.alamat);
        System.out.println("");
        
        // Mencetak atribut pada objek ciri2
        System.out.println("Nama : "+gupron.nama);
        System.out.println("Umur : "+gupron.umur);
        System.out.println("Alamat : "+gupron.alamat);
        System.out.println("");
        
        // Mencetak atribut pada objek ciri3
        System.out.println("Nama : "+adit.nama);
        System.out.println("Umur : "+adit.umur);
        System.out.println("Alamat : "+adit.alamat);
        System.out.println("");
        
        // Memanggil method 
        aldo.berjalan(aldo.nama);
        aldo.berlari(aldo.nama);
        gupron.berjalan(gupron.nama);
        gupron.berlari(gupron.nama);
        adit.berjalan(adit.nama);
        adit.berlari(adit.nama); 
    }
    
} 
