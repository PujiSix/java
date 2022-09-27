package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Switch;

import java.util.Scanner;

public class Menu {
    public static void main(String [] latihan){
        Scanner scanner = new Scanner(System.in);
        char a ;
        do {
            System.out.println("di dalam do");
            System.out.print("ulang : y/t = ");
            a=scanner.next().charAt(0);
        } while (a != 't');
        System.out.println("\nprogram selesai");
        scanner.close();
    } 
}
