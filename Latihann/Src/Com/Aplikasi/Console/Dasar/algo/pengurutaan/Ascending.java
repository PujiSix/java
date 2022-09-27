package Latihann.Src.Com.Aplikasi.Console.Dasar.algo.pengurutaan;

public class Ascending {
    public static void BubbleInt(int[] short2) {
        // sebelum

        for (int s : short2) {
            System.out.print(s + " ");  

        }
        // logic
        for (int i = 0; i < short2.length; i++) {
            for (int j = 0; j < short2.length - 1; j++) {
                if (short2[j] > short2[j + 1]) {// perbedaan terletak pada operator komparasi
                                                // <(descending)||>(ascending)
                    int temp = short2[j];
                    short2[j] = short2[j + 1];
                    short2[j + 1] = temp;
                }

            }

        }

        // sesudah
        System.out.println("\n\n");
        for (int s : short2) {
            System.out.print(s + " ");
        }
        System.out.println();

    }
//===========================================
    public static void Uname(String[] nama) {
        // sebelum
        for (String n : nama) {
            System.out.println(n);
        }
        // logic
        for (int i = 0; i < nama.length; i++) {
            for (int j = 0; j < nama.length - 1; j++) {
                if (nama[j].compareTo(nama[j + 1]) > 0) {
                    String temp = nama[j];
                    nama[j] = nama[j + 1];
                    nama[j + 1] = temp;
                }
            }
        }
        // sesudah
        System.out.println("\n\n");
       // for each
        for (String n : nama) {
            System.out.println(n);
        }
    }

    public static void main(String args[]) {
        int nilai[] = { 60, 12, 1, 100, 290, 3, 1, 2222, 2, 214849 };
        String nama[] = { "agung", "dafin", "angga", "zidan", "xia", "puji", "ines" };
        System.out.println();
        System.out.println("bubble short algortihm");
        System.out.println("======================\n");
        BubbleInt(nilai);
        System.out.println();
        System.out.println("pengurutan nama");
        Uname(nama);

    }

}