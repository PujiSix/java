package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Switch;

public class switchCase {
    public static void main(String[] args) {
        int n = 1;
        switch (n) {
            case 10:
                int a = 10+n;
                System.out.println(a);
                break;
            case 5:
                int b = 3+n;
                System.out.println(b);
                break;
            default:
                System.out.println(n+100);
                break;
        }
    }
}
