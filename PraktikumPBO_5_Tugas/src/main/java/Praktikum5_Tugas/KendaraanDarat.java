/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum5_Tugas;

/**
 *
 * @author hp_5c
 */
class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        super(nama, kecepatan);
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda: " + jumlahRoda);
    }
}