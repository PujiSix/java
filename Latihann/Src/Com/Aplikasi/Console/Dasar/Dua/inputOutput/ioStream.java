/*
 * Byte stream
 * 
   byte stream => FileInputStream
   character stream => FileReader
 */

package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ioStream {
    public static void main(String[] args) throws IOException {

        FileInputStream file = null; // cara akses file 1
        FileOutputStream file2 = null;
        // FileInputStream file = new FileInputStream("input.txt");//cara akses file 2

        // open file
        file = new FileInputStream("input2.txt");
        // file2 = new FileOutputStream("input3.txt");

        // read file
        for (int i = file.read(); i != -1;) {
            System.out.print((char) i);
            i = file.read();
        }
        System.out.println();
        // close file
        file.close();

        // salah satu contoh skenario membuka file
        try {
            file = new FileInputStream("input2.txt");
            file2 = new FileOutputStream("file4.txt");
            int CPY = file.read();
            while (CPY != -1) {
                file2.write(CPY);
                CPY = file.read();
            }
        } finally {
            if (file != null) {
                file.close();
            }
            if (file2 != null) {
                file2.close();
            }
        } // end

        // try with resources
        try(FileInputStream data = new FileInputStream("input.txt");
            FileOutputStream data2 = new FileOutputStream("file1.txt")){
            int data1 = data.read();
            while(data1 != -1){
                data2.write(data1);
                data1 = data.read();
            }
        }catch(IOException e){
                System.out.println("file not found: "+e);
        }

    }
}