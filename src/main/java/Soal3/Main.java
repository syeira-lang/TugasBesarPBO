package soal3;

public class Main {
    public static void main(String[] args) {
        // Object menggunakan constructor berparameter
        Kafe menu1 = new Kafe(
            "MQ1", "Nasi Goreng", 18000, "Makanan"
        );

        menu1.tampilMenu();

        int jumlah = 2;
        System.out.println("Jumlah   : " + jumlah);
        System.out.printf(
            "Total    : Rp%.0f%n",
            menu1.hitungHarga(jumlah)
        );

        System.out.println("----------------------");

        // Object menggunakan constructor tanpa parameter
        Kafe menu2 = new Kafe();
        menu2.tampilMenu();
    }
}