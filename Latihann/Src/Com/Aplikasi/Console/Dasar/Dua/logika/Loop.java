package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.logika;

public class Loop {
    public static void main(String[] Trinangle) {
        System.out.println("Segitiga siku-siku atas\n");
        for (int a = 0; a <= 5; a++) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Segitiga siku-siku bawah\n");
        for (int a = 5; a >= 0; a--) {
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Segitiga siku-siku atas menghadap kiri\n");
        for (int a = 1; a <= 5; a++) {
            for (int j = 5 - 1; j >= a; j--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Segitiga siku-siku bawah menghadap kiri\n");
        for (int a = 5; a >= 0; a--) {
            for (int j = 5; j > a; j--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Segitiga sama kaki menghadap atas");
        for (int a = 1; a <= 5; a++) {
            for (int j = 5 - 1; j >= a; j--) {
                System.out.print(" ");
            }
            for(int b=2;b<=a;b++){
                System.out.print("*");
            }
            for(int c=1;c<=a;c++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("love");
        int size =8;
        int alpha = 65;
        //for first space
        for(int i =size/2;i<size;i+=2){
            for(int j= 1;j<size-i;j+=2){
                System.out.print(" ");
            }
            //for first alphabet
            for(int j=1;j<i+1;j++){
                System.out.print((char)(alpha+j-1));
            }
            //for second space
            for (int j = 1; j < size-i+1; j++) {
                System.out.print(" ");
            }
            //for second alphabet
            for (int j = 1; j < i+1; j++) {
                System.out.print((char)(alpha+j-1));
            }
            System.out.println();
        }
        //lower part
        for (int i = size; i >0; i--) {
            for (int j = 0; j < size-i; j++) {
                System.out.print(" ");
            }
        for (int j = 1; j < i*2; j++) {
            System.out.print((char)(alpha+j-1));
        }
        System.out.println();
        }
    }
}