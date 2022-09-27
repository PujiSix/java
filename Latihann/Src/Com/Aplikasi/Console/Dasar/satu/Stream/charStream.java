package Stream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class charStream {//character stream 
    public static void main(String[] args)throws IOException{
        /*byte stream => FileInputStream
         *character stream => FileReader
         == unbuffered I/O
         */

        //open file
        FileReader file =  new FileReader("char1.txt");
        FileWriter data =  new FileWriter("charCopy.txt");

        //read file
        int n = file.read();
         while(n != -1){
            data.write(n);
            n=file.read();
         }
  
       System.out.println("\n");
       //close file
       file.close();
       data.close();
    }
}
