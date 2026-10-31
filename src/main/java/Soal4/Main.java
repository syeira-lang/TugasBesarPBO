package soal4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Klinik> daftar =
            new ArrayList<>();

        daftar.add(new Klinik(
            "P001", "Andi", "Dr. Siti", 150000
        ));

        daftar.add(new Klinik(
            "P002", "Budi", "Dr. Rina", 200000
        ));

        daftar.add(new Klinik(
            "P003", "Citra", "Dr. Siti", 175000
        ));

        double totalSemua = 0;

        for (Klinik k : daftar) {
            k.tampilData();
            totalSemua += k.hitungTotal();
        }

        System.out.printf(
            "Total seluruh biaya pemeriksaan: Rp%.0f%n",
            totalSemua
        );
    }
}