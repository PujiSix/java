package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Recrusif;

public class Fungsi_recr{
    // private static int fact2(int a){//stckOverflow
    //     if (a == 1){
    //         return 1;
    //     }else{
    //         System.out.println("="+a);
    //         return fact2(a-1);
    //     }
    // }
    private static int fact(int a){
        if (a ==1 ){
            return 1;
        }else {
            return a*fact(a-1);
        }
    }
    public static void main(String[] args) {
        int a=1;
        for (int i = 1 ; i<=10;i++){
            a*=i;
        }
        System.out.println(a);
        System.out.println();
        System.out.println(fact(9));
        System.out.println("stacOverflow");
       // System.out.println(fact2(2000));
    }

}