

import java.util.Scanner;

public class Nomor1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Total penjualan salesman :" );
        int totalPenjualan = scanner.nextInt();
        System.out.print("Komisi yang didapatkan :");
        int komisiYangDidapatkan = scanner.nextInt();

        if(totalPenjualan == 500000){
            komisiYangDidapatkan *= 1.1;
        }else if(totalPenjualan >= 500000){
            komisiYangDidapatkan *= 1.1;
        }else if(totalPenjualan >= 500000){
            komisiYangDidapatkan *= 1.15;
        }

        System.out.println("Total penjualan salesman :" + totalPenjualan);
        System.out.println("Komisi yang didapatkan : " + komisiYangDidapatkan);

    }
}
