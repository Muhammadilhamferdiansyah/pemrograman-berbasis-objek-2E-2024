package modul1;
public class Manusia {
    public static void main(String[] args) {
        Manusiaku manusia1 = new Manusiaku();
        Manusiaku manusia2 = new Manusiaku();
        
        manusia1.nama="Fikri";
        manusia1.umur=20;
        manusia1.alamat="Dukuh Bulak Banteng Sekolahan 9A/44";
        
        manusia2.nama="Arur";
        manusia2.umur=19;
        manusia2.alamat="Masalembo";
        
        System.out.println("Nama saya adalah="+ manusia1.nama);
        System.out.println("Umur saya adalah=" + manusia1.umur);
        System.out.println("Alamat rumah saya di=" + manusia1.alamat);
        
        System.out.println("Nama saya adalah="+ manusia2.nama);
        System.out.println("Umur saya adalah=" + manusia2.umur);
        System.out.println("Alamat rumah saya di=" + manusia2.alamat);
        
        
        manusia1.berlari();
        manusia1.berjalan();
        manusia2.berlari();
        manusia2.berjalan();
    }
    
}
