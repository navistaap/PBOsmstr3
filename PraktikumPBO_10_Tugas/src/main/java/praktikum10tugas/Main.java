/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum10tugas;

/**
 *
 * @author hp_5c
 */
public class Main {
    public static void main(String[] args) {

        Elektronik laptop = new Elektronik();
        Makanan roti = new Makanan();

        double hargaLaptop = 9000000; // contoh harga
        double hargaRoti = 32000;     // contoh harga

        double pajakLaptop = laptop.hitungPajak(hargaLaptop);
        double pajakRoti = roti.hitungPajak(hargaRoti);
        
        double totalLaptop = hargaLaptop + pajakLaptop;
        double totalRoti = hargaRoti + pajakRoti;

        System.out.println("Harga Laptop: " + hargaLaptop);
        System.out.println("Pajak Laptop (10%): " + pajakLaptop);
        System.out.println("Total Harga Laptop: " + totalLaptop);

        System.out.println("\nHarga Roti: " + hargaRoti);
        System.out.println("Pajak Roti (5%): " + pajakRoti);
        System.out.println("Total Harga Roti: " + totalRoti);
    }
}
