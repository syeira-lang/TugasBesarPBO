/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal1;

/**
 *
 * @author Syeira Putri Nabilah
 */

class Buku {
    //atribut
    String kodeBuku;
    String judul;
    String penulis;
    double harga;
    
    //constructor
    Buku(String kodeBuku, String judul, String penulis, double harga){
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }
    
    //Methot tampil data
    void tampilData() {
        System.out.println("Kode Buku   :" + kodeBuku);
        System.out.println("Judul       :" + judul);
        System.out.println("Penulis     :" + penulis);
        System.out.println("Harga       :" + harga);
        System.out.println("----------------------------");
    }    
}

