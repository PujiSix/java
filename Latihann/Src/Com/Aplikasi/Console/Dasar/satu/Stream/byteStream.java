package Stream;

import java.io.FileInputStream;
import java.io.IOException;

public class byteStream {
    public static void main(String[] args)throws IOException {
        FileInputStream file = null;
        System.out.println("file 1 "+file);
        file=new FileInputStream("input.txt");
        System.out.println("file 2 "+file);
        file.close();
        System.out.println("file 3 "+file);
        file.close();
         //byte stream adalah program yang menggunakan inputan dan outputan 8 bit
    }
}
