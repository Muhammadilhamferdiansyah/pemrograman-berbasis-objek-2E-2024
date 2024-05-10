/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author user
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia2 biodata= new Manusia2();
        Manusia2 biodata1= new Manusia2();
        
        biodata.nama="rendi";
        biodata.umur=19;
        biodata.alamat="Lamongan";
        
        biodata1.nama="wahyu";
        biodata1.umur=20;
        biodata1.alamat="Gresik";
        
        System.out.println("perkenalkan nama saya    :"+biodata.nama);
        System.out.println("sekarang saya berumur    :"+biodata.umur);
        System.out.println("saya berasal dari daerah :"+biodata.alamat);
        System.out.println("-------------------------------------------------");
        System.out.println("perkenalkan nama saya    :"+biodata1.nama);
        System.out.println("sekarang saya berumur    :"+biodata1.umur);
        System.out.println("saya berasal dari daerah :"+biodata1.alamat);
        System.out.println("-------------------------------------------------");
        biodata.berjalan();
        biodata.berlari();
        System.out.println("--------------------------------------------------");
                
    }
    
}
