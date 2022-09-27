public class Puji_1850_2{
    public static void main(String[]args){
        System.out.println("tugas 2 tanggal 19/9/2022");
        System.out.println("array 1 dimensi");
        int a[]=new int[3];//array dengan tipe data integer dengan jumlah elemen 3
        a[0]=5;//inisialisasi array index 0
        a[1]=3;//inisialisasi array index 1
        a[2]=9;//inisialisasi array index 2
        String x[]={"satu","dua","tiga","empat","lima"};//array dengan tipe data String yang sudah terdapat isinya
        for (int i =0;i<a.length;i++){//perulangan for sebanyak panjang elemen array a
            System.out.println("nilai a["+i+"] = "+a[i]);//array a index ke i akan menampilkan data yang sudah di inisialisasi sebelumnya
        }
          System.out.println();        
        for (int i =0;i<x.length;i++){//perulangan for sebanyak panjang elemen array x
            System.out.println("nilai a["+i+"] = "+x[i]);//array x index ke i akan menampilkan data yang sudah di inisialisasi sebelumnya
        }
    }
}