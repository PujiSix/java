package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.logika;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println("deret Fibonaci\n");
        int fn_2, fn_1, fn;

        fn = 1;
        fn_1 = 1;
        fn_2 = 0;
        // logic for
        for (int i = 0; i <= 10; i++) {
            System.out.printf("Fibonaci dari %d adalah : %d\n",i,fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }
    }
}
