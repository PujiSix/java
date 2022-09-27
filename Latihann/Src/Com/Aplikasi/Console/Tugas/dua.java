package Latihann.Src.Com.Aplikasi.Console.Tugas;

import java.util.Scanner;

public class dua {
    public static void main(String[] args) {
        Scanner InUs = new Scanner(System.in);
        int nilai = InUs.nextInt();
        System.out.println("angka yang dapat membagi" + nilai + "tanpa sisa adalah : ");
        int i = 1;
        do {
            if (nilai >= 0) {
                if (nilai % i == 0) {
                  System.out.print(nilai/i+" ");
                }
            } else {
                System.out.println("harus bilangan positif");
            }
            i++;
        } while (i <= nilai);
        InUs.close();
    }
}
