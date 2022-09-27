package Latihann.Src.Com.Aplikasi.Console.Dasar.array;

import java.util.Arrays;

public class arrayMatrix {
    public static void main(String[] latihanArray2D) {
        int[][] array1 = { { 1, 2, 3 },
                { 6, 7, 8 },
                { 3, 2, 1 } };
        int[][] array2 = { { 5, 6, 3 },
                { 1, 2, 1 },
                { 4, 2, 1 } };
        int kolom = array1.length, baris = array2[0].length;
        int[][] hasil = new int[kolom][baris];
        for (int i = 0; i < kolom; i++) {
            for (int j = 0; j < baris; j++) {
                hasil[i][j] = array2[i][j] * array1[i][j]; 
            }
        }
        for (int[] a : hasil) {
          System.out.println( Arrays.toString(a));
        }
        System.out.println( Arrays.deepToString(hasil));//mendatar
    }
}
