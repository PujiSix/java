package Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class bufferedStream {
    public static void main(String[] args)throws IOException {
     FileInputStream file = new FileInputStream("char1.txt");
     System.out.println(file.available());

     long awal,akhir;
     //menghitung waktu pembacaan file
     awal = System.nanoTime();
     System.out.println(file.readAllBytes());
     akhir = System.nanoTime();
     System.out.println("= "+(akhir-awal));
     file.close();
     System.out.println("\n");
     //menghitung waktu pembacaan memori
    FileInputStream input = new FileInputStream("input.txt");
    BufferedInputStream inputBuffer = new BufferedInputStream(input);
    System.out.println(inputBuffer.available());

    inputBuffer.mark(200);
    awal = System.nanoTime();
    System.out.println(inputBuffer.readAllBytes());
    akhir = System.nanoTime();
    System.out.println("= "+(akhir-awal));
    inputBuffer.reset();

    //baca ulang
    byte [] data = inputBuffer.readAllBytes();
    String datString =new String(data);//mengubah byte menjadi string
    System.out.print(datString);
    System.out.println();

    inputBuffer.close();
    
    


    }
}
