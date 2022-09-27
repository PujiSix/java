/*
 * using Buffered byte stream and StringBuilder
 */

package Stream;

import java.io.FileInputStream;
import java.io.IOException;
//import javax.swing.*;

public class inputFIle {
    public static void main(String[] args) {
    FileInputStream file = null;
    try {
        file = new FileInputStream("input.txt");
        byte data [] = file.readAllBytes();
        String temp = new String(data);
        //JOptionPane.showMessageDialog(null,temp);//menggunakan gui
        System.out.println(temp);//menggunakna console
    } catch (IOException e) {
        System.out.println("file not found : "+e);
    }
    
    }
}
