package Latihann.Src.Com.Aplikasi.Console.Dasar.array;

import java.util.Arrays;

public class arrayHeap {
    public static void main(String[] args) {//passbyreferance//memori method main akan mengikuti method array
        int[] satu = new int[1];
        satu[0]=2;
        System.out.println(satu[0]);
        array(satu);
        System.out.println(satu[0]);
    }
    private static void array(int[] arry){
        System.out.println(arry);//memori heap
        arry[0]=10;
        System.out.println(Arrays.toString(arry));
        
    }
}
