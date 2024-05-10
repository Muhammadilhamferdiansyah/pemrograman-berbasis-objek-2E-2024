/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasidatamahasiswa;

/**
 *
 * @author ahmad
 */
class Universitas {
     static String namaUniversitas;

    // Static method untuk mengatur nama universitas
    static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    // Static method untuk mendapatkan nama universitas
    static String getNamaUniversitas() {
        return namaUniversitas;
    }
}
