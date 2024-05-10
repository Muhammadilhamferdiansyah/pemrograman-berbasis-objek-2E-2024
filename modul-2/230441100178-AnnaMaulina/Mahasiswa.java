package apkdatamahasiswa;
//child class
public class Mahasiswa extends Universitas{
    private String nim;
    private String nama;
    private String alamat;
    private int jurusan;
    
    //constructor dengan parameter
    public Mahasiswa(String nim, String nama, String alamat, int jurusan){
        this.nim=nim;
        this.nama=nama;
        this.alamat=alamat;
        this.jurusan=jurusan;
    }
    
    public String getNim(){
        return nim;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public int getJurusan(){
        return jurusan;
    }
    public String getJurusanStr(){
        switch (jurusan) {
            case 41:
                return "TEKNIK INFORMATIKA";
            case 42:
                return "TEKNIK INDUSTRI";
            case 43:
                return "TEKNIK ELEKTRO";
            case 44:
                return "SISTEM INFORMASI";
            case 48:
                return "TEKNIK MESIN";
            case 49:
                return "TEKNIK MEKATRONIKA";
            default:
                return "Jurusan tidak tersedia";
        }
    }
}