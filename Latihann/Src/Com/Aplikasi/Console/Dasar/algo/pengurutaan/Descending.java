package Latihann.Src.Com.Aplikasi.Console.Dasar.algo.pengurutaan;

//Descending
public class Descending {
    public static void BubbleInt(int[] short1) {
        // sebelum
        for (int s : short1) {
            System.out.print(s + " ");

        }
        // logic
        for (int i = 0; i < short1.length; i++) {
            for (int j = 0; j < short1.length -i - 1; j++) {
                if (short1[j] < short1[j + 1]) {
                    int temp = short1[j];
                    short1[j] = short1[j + 1];
                    short1[j + 1] = temp;
                }
            }
        }

        // sesudah
        System.out.println("\n\n");
        for (int s : short1) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int nilai[] = { 60, 12, 1, 100, 290, 3, 1, 2222 };
        System.out.println();
        System.out.println("bubble short algortihm");
        System.out.println("======================\n");
        BubbleInt(nilai);
    }
}// akhir