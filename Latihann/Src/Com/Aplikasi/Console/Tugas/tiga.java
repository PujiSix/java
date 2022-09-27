package Latihann.Src.Com.Aplikasi.Console.Tugas;

import java.util.Scanner;

public class tiga {
    public static void main(String[] args) {
        Scanner InUs = new Scanner(System.in);
        int angka = InUs.nextInt();
        int genap = 0, ganjil = 0;
        System.out.println("Angka-angka yang merupakan kelipatan 3 atau 5 kurang dari "+angka+" adalah :");
        for (int i = 1; i < 20; i += 1) {
            if (i % 5 == 0||i%3==0) {
                System.out.print(i + " ");
               if (i % 2 ==0) {
                    genap += 1;
                } else {
                    ganjil += 1;
                }
            } 
        }
        System.out.println();
        System.out.printf("jumlah angka genap : %d angka\n",genap);
        System.out.printf("jumlah angka ganjil : %d angka\n",ganjil);
        InUs.close();
    }
}
