/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author USEr
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //objek1
        Manusiaya person1 = new Manusiaya();
        person1.nama="Yuki";
        person1.umur=17;
        person1.alamat="Cilegon";
        
        //objek2
        Manusiaya person2 = new Manusiaya();
        person2.nama="Rei";
        person2.umur=18;
        person2.alamat="Lamongan";
        
        //objek3
        Manusiaya person3 = new Manusiaya();
        person3.nama="Ragna";
        person3.umur=17;
        person3.alamat="Jakarta";
        
        person1.datamanusia();
        person1.berjalan();
        System.out.println("-");
        person2.datamanusia();
        person2.berlari();
        System.out.println("-");
        person3.datamanusia();

    }
    
}
