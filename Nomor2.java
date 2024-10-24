

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Tarif dan persentase pelayanan
        int tarif = {50000, 40000, 30000}; 
        double persentasePelayanan = {0.30, 0.20, 0.10}; 
        
        System.out.print("Masukkan jumlah pelanggan: ");
        int jumlahPelanggan = scanner.nextInt();
        
        for (int i = 0; i < jumlahPelanggan; i++) {
            System.out.print("Masukkan tipe bungalow (1, 2, atau 3) untuk pelanggan " + (i + 1) + ": ");
            int tipeBungalow = scanner.nextInt() - 1; 
            System.out.print("Masukkan lama menginap (dalam malam): ");
            int lamaMenginap = scanner.nextInt();
            
            // Hitung biaya menginap
            double biayaMenginap = lamaMenginap * tarif;
            // Hitung biaya pelayanan
            double biayaPelayanan = biayaMenginap * persentasePelayanan;
            // Hitung total biaya
            double totalBiaya = biayaMenginap + biayaPelayanan;
            
            // Tampilkan hasil
            System.out.println("Biaya Menginap: Rp " + biayaMenginap);
            System.out.println("Biaya Pelayanan: Rp " + biayaPelayanan);
            System.out.println("Total Biaya: Rp " + totalBiaya);
            System.out.println();
        }
        
        scanner.close();
    }
}

