package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.castomEXC;

import java.io.FileInputStream;
import java.io.IOException;

public class Excapt {
    public static void main(String[] args) {
        FileInputStream file =null;//input file
       try {//try catch
        file=new FileInputStream("input.txt");
        for (int i = 0; i < 4; i++) {
            System.out.print((char)file.read());
        }
       } catch ( IOException e) {
           System.out.println("file not found");
       }finally{
        try {
            if (file!=null) {
                 file.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       }
        System.out.println("\nprogram selesai");
    }
}
