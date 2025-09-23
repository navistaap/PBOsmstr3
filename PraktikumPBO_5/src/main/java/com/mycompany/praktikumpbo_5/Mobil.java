/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author hp_5c
 */
public class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String nama, int kecepatan, int jumlahPintu) {
        super(nama, kecepatan);
        this.jumlahPintu = jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Mobil");
        System.out.println("Nama Mobil: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }

    public void tampilkanInfoMobil() {
        System.out.println("Mobil " + nama + " memiliki " + jumlahPintu + " pintu.");
    }
}
