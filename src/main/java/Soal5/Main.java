package soal5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bioskop> daftarTiket =
            new ArrayList<>();

        daftarTiket.add(new Bioskop(
            "T001", "Petualangan", "Reguler",
            40000, 2
        ));

        daftarTiket.add(new Bioskop(
            "T002", "Film Aksi", "VIP",
            75000, 3
        ));

        daftarTiket.add(new Bioskop(
            "T003", "Film Komedi", "Reguler",
            40000, 1
        ));

        double totalPendapatan = 0;

        System.out.println("STRUK PEMBELIAN TIKET");
        System.out.println("======================");

        for (Bioskop tiket : daftarTiket) {
            tiket.tampilData();
            totalPendapatan += tiket.hitungTotal();
        }

        System.out.printf(
            "Total Pendapatan: Rp%.0f%n",
            totalPendapatan
        );
    }
}