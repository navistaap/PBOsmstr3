/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author hp_5c
 */
public class SepedaMotor extends Kendaraan {
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan);
        this.jenisMesin = jenisMesin;
    }


    @Override
    public void tampilkanInfo() {
        System.out.println("Informasi Sepeda Motor");
        System.out.println("Nama Motor: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}
