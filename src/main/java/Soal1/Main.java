/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Syeira Putri Nabilah
 */

public class Main {
    public static void main(String[] args) {
        Buku buku1 = new Buku(
            "B001", "Pemrograman Java",
            "Andi", 85000
        );

        Buku buku2 = new Buku(
            "B002", "Dasar OOP",
            "Budi", 75000
        );

        buku1.tampilData();
        buku2.tampilData();
    }
}