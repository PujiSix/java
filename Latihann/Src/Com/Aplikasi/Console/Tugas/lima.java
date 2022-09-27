package Latihann.Src.Com.Aplikasi.Console.Tugas;
import java.util.Scanner;
import java.util.Arrays;
public class lima {
    public static void main(String[] args) {
        Scanner InUs = new Scanner(System.in);
        int []Array=new int[5];
        for (int i = 0; i < Array.length; i++) {
            System.out.print("input bilangan ke "+(i+1)+" = ");Array[i]=InUs.nextInt();
        }
        System.out.println("Data yang di input adalah : "+Arrays.toString(Array));
        InUs.close();
    }
}
