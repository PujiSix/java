package Exception;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
public class exception_IO {
    public static void main(String[] latihan) {
        //try,catch,finally
        Scanner input = new Scanner(System.in);
        int [] data ={11,12,-13,-14,15};//index = 5
        int nilai= input.nextInt();
         //exception
         try{
            System.out.printf("data = %(d\n",data[nilai]);
            FileInputStream  file = new FileInputStream("text.txt"); 
            file.close();
         }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ga ada");
            e.printStackTrace();//mengetahui baris
         }catch(IOException e){
             //System.out.println("file");
             System.out.println(e);
         }finally{
            System.out.println("untuk menutup program");
             input.close();
         }
         System.out.println("program selesai");
      
    }
}
