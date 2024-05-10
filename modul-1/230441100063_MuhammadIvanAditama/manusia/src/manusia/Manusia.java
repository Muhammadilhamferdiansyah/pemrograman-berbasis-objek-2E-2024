/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author Ivan Aditama
 */
    class manusiaa{
        String nama,alamat;
        int umur;
        void berjalan(){
        System.out.println(this.nama+" sedang berjalan");
        }
        void berlari(){
        System.out.println(this.nama+" sedang berlari");
        }
    }
public class Manusia {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        manusiaa temen = new manusiaa();
        temen.nama="Rizal";
        temen.umur=20;
        temen.alamat="Jl.Geger barat";
        
        System.out.println("Nama teman saya adalah "+temen.nama);
        System.out.println("Umur teman saya adalah "+temen.umur);
        System.out.println("Alamat teman saya ada di "+temen.alamat);
        temen.berjalan();
        System.out.println("--------------------------------------------------");
        
        manusiaa guru = new manusiaa();
        guru.nama="Pak Kevin";
        guru.umur=30;
        guru.alamat="Jl.Tidar";
        
        System.out.println("Nama guru SMK saya adalah "+guru.nama);
        System.out.println("Umur guru saya adalah "+guru.umur);
        System.out.println("Alamat guru saya ada di "+guru.alamat);
        guru.berlari();
        System.out.println("--------------------------------------------------");
        
        manusiaa tetangga = new manusiaa();
        tetangga.nama="Bagas";
        tetangga.umur=19;
        tetangga.alamat="Jl.Mojoanyar";
        
        System.out.println("Nama tetangga saya adalah "+tetangga.nama);
        System.out.println("Umur tetangga saya adalah "+tetangga.umur);
        System.out.println("Tetangga saya beralamat di "+tetangga.alamat);
        tetangga.berjalan();
        
                
    }
    
}
