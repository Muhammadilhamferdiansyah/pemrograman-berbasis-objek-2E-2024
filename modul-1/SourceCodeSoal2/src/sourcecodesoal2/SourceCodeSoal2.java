/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sourcecodesoal2;

/**
 *
 * @author Chusnul Yakin
 */

public class SourceCodeSoal2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Scanner input = new java.util.Scanner (System.in);
        
        // Atribut
        String NAMA;
        String NIM;
        String PRODI;
        String ALAMAT;
        
        // Mencetak Atribut Pada Objek
        System.out.println("Input Nama = ");
        NAMA=input.nextLine();
        System.out.println("Input NIM = ");
        NIM=input.nextLine();
        System.out.println("Input Prodi = ");
        PRODI=input.nextLine();
        System.out.println("Input Alamat = ");
        ALAMAT=input.nextLine();

        // Method
        System.out.println("");
        System.out.println("Nama saya " + NAMA);
        System.out.println("NIM saya " + NIM);
        System.out.println("Prodi saya " + PRODI);
        System.out.println("Alamat saya " + ALAMAT);
}
}
