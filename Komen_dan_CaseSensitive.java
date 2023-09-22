/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Galant
 */
public class Komen_dan_CaseSensitive {
    public static void main(String[] args) {
        // Inisialisasi variabel
        String teks1 = "Ini adalah contoh teks.";
        String teks2 = "Ini adalah contoh TEKS.";

        // Periksa apakah teks1 sama dengan teks2 (case sensitive)
        boolean hasilPengecekan = teks1.equals(teks2);

        // Tampilkan hasil pengecekan case sensitive
        if (hasilPengecekan) {
            System.out.println("Pencocokan case sensitive: Ya");
        } else {
            System.out.println("Pencocokan case sensitive: Tidak");
        }
    }
}

 

