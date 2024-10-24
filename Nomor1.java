
import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input total penjualan
        System.out.print("Masukkan total penjualan salesman: ");
        double totalPenjualan = scanner.nextDouble();
        
        // Variabel untuk menyimpan komisi
        double komisi = 0.0;

        // Hitung komisi berdasarkan ketentuan
        if (totalPenjualan <= 500000) {
            komisi = totalPenjualan * 0.10; // 10% untuk penjualan ≤ Rp 500.000
        } else {
            komisi = 500000 * 0.10; // Komisi untuk Rp 500.000 pertama
            double sisaPenjualan = 0;
            komisi += sisaPenjualan * 0.15; // 15% untuk sisa penjualan
        }

        // Output hasil
        System.out.printf("Total penjualan salesman: " + totalPenjualan);
        System.out.printf("Komisi yang didapatkan = " + komisi);
        
        scanner.close();
    }
}


