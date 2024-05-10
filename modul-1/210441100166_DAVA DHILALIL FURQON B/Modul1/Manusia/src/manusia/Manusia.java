package manusia;
public class Manusia {
    String nama,umur, alamat ;
    void tampilkan()  {
      System.out.println("Nama          :" +nama);
      System.out.println("Umur          :" +umur);
      System.out.println("Alamat        :" +alamat);
    }
    void berjalan(String jalan){
      System.out.println("Saya berjalan dengan :" +jalan);
    }
    void berlari(String lari){
      System.out.println("hasan berlari di   :" +lari);
    }    
    public static void main(String[] args){
      Manusia melakukan= new Manusia();
      melakukan.nama= "Dava Dhilalil Furqon Baihaqi";
      melakukan.umur="21 tahun";
      melakukan.alamat="lamongan";
      melakukan.tampilkan();
      melakukan.berjalan(" Air");
      melakukan.berlari(" Udara");
      
    }
}

