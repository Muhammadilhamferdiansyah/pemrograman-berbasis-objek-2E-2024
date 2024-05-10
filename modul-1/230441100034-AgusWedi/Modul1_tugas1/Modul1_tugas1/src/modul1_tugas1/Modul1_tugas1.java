package modul1_tugas1;

class manusia{
    String nama,alamat;
    int umur;
    
    public void berlari(){
        System.out.println( nama + " sedang berlari");
    }
    
    void berjalan(){
        System.out.println( nama + " sedang berjalan");
    }
}

public class Modul1_tugas1 {
    public static void main(String[] args) {
        manusia orang1 = new manusia();
        manusia orang2 = new manusia();
        
        orang1.nama = "Agus";
        orang1.umur = 19;
        orang1.alamat = "Sampang";
        System.out.println("nama dari orang yang pertama adalah " + orang1.nama);
        System.out.println("Orang pertama beralamat di " + orang1.alamat);
        System.out.println("umur dari orang yang pertama adalah " + orang1.umur + " tahun ");
        orang1.berjalan();
        orang1.berlari();
        System.out.println("------------------------------------------------");
        
        orang2.nama = "zidan";
        orang2.umur = 20;
        orang2.alamat= "banyuates";
        System.out.println("nama dari orang kedua adalah " + orang2.nama);
        System.out.println("orang kedua beralamat di " + orang2.alamat);
        System.out.println("umur dari orang kedua adalah " + orang2.umur + " tahun ");
        orang2.berjalan();
        orang2.berlari();
        System.out.println();
        System.out.println("Terimakasih");
    }
    
}
