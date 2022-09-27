package Latihann.Src.Com.Aplikasi.Console.Tugas;

import java.util.Scanner;


public class empat {
    public static void main(String[] args) {
        Scanner InUs = new Scanner(System.in);
        System.out.print("jumlah baris ");
        int baris = InUs.nextInt();
        System.out.print("jumlah kolom ");
        int kolom = InUs.nextInt();
        char x = 'x';
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print(x);
                if (x == 'x') {
                    x = 'o';
                } else {
                    x = 'x';
                }
            }
            System.out.println();
        }
        InUs.close();
    }
}
