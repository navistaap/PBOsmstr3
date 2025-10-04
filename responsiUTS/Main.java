/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package responsiUTS;

/**
 *
 * @author hp_5c
 */
public class Main {
    public static void main(String[] args) {

        Elektronik produk1 = new Elektronik("Televisi", 6000000, 2);
        produk1.tampilkanInfo();

        System.out.println();

        PegawaiTetap pegawai1 = new PegawaiTetap("Vista", 9000000, 2000000);
        pegawai1.tampilkanInfo();

        System.out.println();

        Produk produk2 = new Makanan("Biskuit", 9000, "2026-12-30");
        Pegawai pegawai2 = new PegawaiKontrak("Dara", 8000000, 18);

        produk2.tampilkanInfo();
        System.out.println();
        pegawai2.tampilkanInfo();
    }
}
