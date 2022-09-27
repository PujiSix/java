package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Method;
import java.util.*;
public class metod2 {
    static int metDua(int a,int b){
      int  hasil = a+b;
        return hasil;
    }
    private static int metDua(int a,char b,int c){
        System.out.println("metDua");
        System.out.println(); 
        switch(b){
            case '-' :return a-c;
          
            case '+' : return a+c;
          
            default :return 0;
        }
    }
    public static void main(String[] args) {
       Scanner InUs=new Scanner(System.in);
       int a = InUs.nextInt();
     char b = InUs.next().charAt(0);int c=InUs.nextInt();
      
      int hasil = metDua(a, b, c);
      System.out.println(hasil);
      System.out.println();
     int d = metDua(9, 10);
System.out.println(d);
InUs.close();
    }
}
