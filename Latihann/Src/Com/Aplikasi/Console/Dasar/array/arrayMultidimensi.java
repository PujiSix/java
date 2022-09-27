package Latihann.Src.Com.Aplikasi.Console.Dasar.array;

import java.util.Arrays;

public class arrayMultidimensi {
    public static void main(String[] args) {
        int[][] array =new int[10][8];
      
        printArray2D(array);
        System.out.println();
        print(array);
    }

    private static void printArray2D(int[][] arr) {//print array 2d menggunakan for biasa
      for (int i = 0; i < arr.length; i++) {
              Arrays.fill(arr[i], 2);
              System.out.println(Arrays.toString(arr[i]));
          
      }
    }
    private static void print(int[][]aray){
        for (int[] i : aray) {
            Arrays.fill(i, 3);
            System.out.println(Arrays.toString(i));
        }
    }
}
