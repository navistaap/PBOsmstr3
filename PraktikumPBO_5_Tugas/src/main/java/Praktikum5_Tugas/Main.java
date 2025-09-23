/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum5_Tugas;

/**
 *
 * @author hp_5c
 */
public class Main {
    public static void main(String[] args) {
        // Bagian Hewan
        System.out.println("Informasi Hewan");
        Hewan kucing = new Kucing("Kitty");
        Hewan anjing = new Anjing("Blue");

        kucing.tampilkanInfo();
        System.out.println();
        anjing.tampilkanInfo();

        System.out.println("\nInformasi Kendaraan");
        // Bagian Kendaraan
        Mobil mobil = new Mobil("Mitsubishi Mirage", 180, 4, 4);
        SepedaMotor motor = new SepedaMotor("Honda Genio", 100, 2, "4-Tak");

        mobil.tampilkanInfo();
        System.out.println();
        motor.tampilkanInfo();
    }
}