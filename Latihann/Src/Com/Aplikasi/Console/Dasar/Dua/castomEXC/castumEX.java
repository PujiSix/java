package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.castomEXC;

public class castumEX {
    public static void main(String[] args) {
        String n =null;
        try {
            check(n);
        } catch (Exception e) {
            System.out.println("a problem occured :");
            e.printStackTrace();
        }
      
    }
    public static void check(String n) {
        if (n.contains("@")) {//jika n tidak berisi @
            System.out.println("sign up");
        } else {
            System.out.println("must contain  a'@");
        }
    }
}