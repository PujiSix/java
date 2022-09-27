package Latihann.Src.Com.Aplikasi.Console.Dasar.array;

import java.util.Arrays;

public class latihanArray {
    // program utama
    public static void main(String[] args) {
        final int[] array = { 1, 32, 2, 0, -9, -1, 100 };
        final int[] array2 = { 2, 10, 2, 9, 12, 100, 2, 3 };
        toStr(array);
        toStr(array2);
        System.out.println("ini Asscending");
        sortAsscending(array);
        toStr(array);
        System.out.println("============================");
        System.out.println("ini Desscending");
        int []hasilDess=sortDesscending(penjumlahanArray(array, array2));
        toStr(hasilDess);
        System.out.println("============================");
        System.out.println("ini Penjumlahan dari");
        toStr(array2);
        System.out.println("+");
        toStr(array);
        int[]hasilPen=penjumlahanArray(array, array2);
        System.out.println("=");
        toStr(hasilPen);
        System.out.println("============================");
        System.out.println("ini Descending tanpa sort");
        sortDesscending2(array2);
        toStr(array2);
       
    }
    
    private static int[] penjumlahanArray(int[] array1, int[] array2) {
     int[]hasil=new int[array1.length];
     int i =0;
     while (i<array1.length) {
        hasil[i]=array1[i]+array2[i];
        i++;
     }
     return hasil;
    }

    private static void sortAsscending(int[] arr) {// Asscending
        Arrays.sort(arr);
    }

    private static int[] sortDesscending(int[] arr) {// Desscending
        Arrays.sort(arr);
        int[] array = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[(array.length - 1) - i];
        }return arr;

    }
    private static void sortDesscending2(int[] arr){//Bubble short
     for(int i=0;i<arr.length;i++){
        for (int j = 0; j < arr.length-i-1; j++) {
            if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
     }
    }
    public static void sortDesscending3(int[] args) {
        
    }

    private static void toStr(int[] isiArray) {
        System.out.println(Arrays.toString(isiArray));
    }
}
