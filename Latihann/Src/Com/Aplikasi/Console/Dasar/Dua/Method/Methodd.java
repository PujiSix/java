package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Method;

import java.lang.Math;

public class Methodd {
    static int hitung(int input) {//Method return
        int hasil;
        hasil = input * 2 + 100;
        System.out.println("hasilnya = " + hasil);
        return hasil;
    }

    static String nama(String Input) {//Method return
        String nama = Input;
        System.out.println("nama saya " + nama);
        return nama;
    }
    static void random() {//Method void//Random number
       int a=10,b=1,hasil=200-b+1,x;
       for( x=b;x<=a;x++){
          
        x = (int)(Math.random() * hasil) + b;
          
       System.out.println("ini random =" + x);
       }
       
    }
    static int wile(int input){
        int a=0,b=0,c=input;
        while(b<=c){
            a=b*c;
            System.out.println(a);
            b++;
        }
        return a;
    }
    private static int hitung(int input1,int input2){
        System.out.println("ini method hitung V2");
        return input1+input2;
    }

    static void gabungan(int input) {//Method void
        System.out.println("ini di dalam method void");
        System.out.println(nama("puji santoso"));
        System.out.println(hitung(input));
       random();
    }
    public static void main(String[] args) {//Main program
        System.out.println();
        gabungan(4);
        System.out.println();
        
        System.out.println();
        System.out.println();
        int x=hitung(2,4);
        System.out.println(x);
        System.out.println();
        System.out.println(wile(15));
    }
}