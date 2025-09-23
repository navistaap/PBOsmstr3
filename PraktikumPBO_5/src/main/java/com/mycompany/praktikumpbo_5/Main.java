/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.praktikumpbo_5;

/**
 *
 * @author hp_5c
 */
public class Main {
     public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan("Kendaraan Pribadi", 60);
        kendaraan.tampilkanInfo();
        System.out.println();

        Mobil mobil = new Mobil("Toyota", 180, 4);
        mobil.tampilkanInfo();
        mobil.tampilkanInfoMobil();
        System.out.println();

        SepedaMotor motor = new SepedaMotor("Yamaha", 120, "2-Tak");
        motor.tampilkanInfo();
    }
}
