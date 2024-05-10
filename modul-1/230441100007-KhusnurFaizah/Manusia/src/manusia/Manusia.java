/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

import javax.lang.model.SourceVersion;

/**
 *
 * @author KHUSNUR FAIZZAH
 */
public class Manusia {
    public static void main(String[] args) {
        Classbaru identitas = new Classbaru();
        identitas.nama="Khusnur Faizah";
        identitas.umur=19;
        identitas.alamat="Surabaya";
      
        Classbaru biodata = new Classbaru();
        biodata.nama="reva hani";
        biodata.umur=17;
        biodata.alamat="Sidoarjo";
        
        System.out.println("Nama Saya "+identitas.nama);
        System.out.println("Umur Saya "+identitas.umur);
        System.out.println("Alamat Saya "+identitas.alamat);
        System.out.println("Nama Saya "+biodata.nama);
        System.out.println("Umur Saya "+biodata.umur);
        System.out.println("Alamat Saya "+biodata.alamat);
       
        identitas.berjalan();
        identitas.berlari();
        // TODO code application logic here
    }
}

