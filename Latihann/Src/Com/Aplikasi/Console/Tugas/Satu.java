package Latihann.Src.Com.Aplikasi.Console.Tugas;
import java.util.Scanner;
public class Satu {
    public static void main(String[] args_1) {
        Scanner InUs=new Scanner(System.in);
        int input = InUs.nextInt();int i=1;
       while (i<=10) {
        System.out.println(input+" : "+i+" = "+input/i+" sisa "+input%i);
        i++;
       } 
        InUs.close();
    }
}
