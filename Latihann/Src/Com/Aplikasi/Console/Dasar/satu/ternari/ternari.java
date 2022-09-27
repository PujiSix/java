package ternari;

import java.util.*;

class ternary {
    public static void main(String[] args) {
        int INput;
        Scanner inus = new Scanner(System.in);
        System.out.print("= ");
        INput = inus.nextInt();
        terHitungan(INput);
        System.out.println();
        ternarii(INput);
        inus.close();
    }

    private static void terHitungan(int In) {
        int hasil = (In == 10) ? (In + 10) : (In - 10);
        System.out.println("ini hasilnya = " + hasil);

    }

    public static void ternarii(int args) {
        String hasil = (args<=50&&args>=30) ? ("di dalam") : ("di luar");
        System.out.println(hasil);
    }
}
