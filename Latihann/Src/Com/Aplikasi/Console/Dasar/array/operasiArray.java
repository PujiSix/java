package Latihann.Src.Com.Aplikasi.Console.Dasar.array;

import java.util.Arrays;

public class operasiArray {
    public static void main(String[] args) {
        int[] array1 = { 2, 31, 0, 2, 1, -9, 10, 100, -1 };
        int[] array2 = new int[array1.length];
        argumenArrays(array1, "arrayToString");

        // menyalin array dengan loop//cara paling sederhana
        for (int i = 0; i < array1.length; i++) { 
            array2[i] = array1[i];
        }
        argumenArrays(array2, "array 2|menyalin dengan loop");

        // menyalin array dengan CopyOf
        int[] array3 = Arrays.copyOf(array1, array1.length);
        argumenArrays(array3, "array 3|menyalin dengan CopyOf");

        // menyalin array dengan CopyOfRange
        int[] array4 = Arrays.copyOfRange(array1, 2, 7);
        argumenArrays(array4, "array 4|menyalin dengan copyOfRange");// memilih indexnya dari n ke n
        // Fill array = memberikan nilai pada tipe data array yang di tentukan bisa
        // keseluruhan dan juga bisa ditentukan dari index ke n sampai ke n
        int[] array5 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2 };
        Arrays.fill(array5, 1);
        argumenArrays(array5, "array 5|fill array mengubah semuanya");
        Arrays.fill(array5, 3, 7, 3);// (variabel ,from,to,args)
        argumenArrays(array5, "array 5|fill array mengubah dari index ke 3 sampai 7-1");
        
        // komparasi array
        // array1=array2;//penyamaan memori pada array
        if (Arrays.equals(array1, array2)) {// komparasi menggunakan equals
            System.out.println("nilai sama|komparasi dengan equals");
        } else {
            System.out.println("nilai beda|komparasi dengan equals");
        }
        //============================================================
        int[]array6={1,2,3,4,5,6,7,8};
        System.out.println(Arrays.compare(array1, array6)+" = Compare To");//mengecek array yang lebih besar //0=x==y//1=x>y//-1=x<y
        System.out.println(Arrays.mismatch(array1, array6)+" = Mismatch");//mengecek indeks array yang berbeda
        //Search array===============================================
        Arrays.sort(array1);
        argumenArrays(array1,"sorting");
        int posisi=Arrays.binarySearch(array1, 2);//cara mencari nilai array pada indeks ke -n//syaratnya harus di sorting dulu
        System.out.println("posisinya ada di : "+posisi+" = Binarysearch");
    }

    private static void argumenArrays(int[] isiData, String comment) {
        System.out.println(Arrays.toString(isiData) + " = " + comment + "\n");// Arrays.toString//merubah array menjadi
                                                                              // string
    }
}