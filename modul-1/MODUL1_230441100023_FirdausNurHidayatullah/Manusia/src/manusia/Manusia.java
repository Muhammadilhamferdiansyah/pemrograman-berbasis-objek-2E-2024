/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusia;

/**
 *
 * @author ASUS
 */
public class Manusia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        human hidup=new human();
        
        hidup.nama="Firdaus";
        hidup.umur=19;
        hidup.alamat="Surabaya";
        
        human urip=new human();
        
        urip.nama="Razan";
        urip.umur=63;
        urip.alamat="Sumenep";
        
        hidup.Allatt();
        hidup.berjalan();
        
        
        urip.Allatt();
        urip.berlari();
        
    }
    
}
