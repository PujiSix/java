package Latihann.Src.Com.Aplikasi.Console.Dasar.Dua.Recrusif;

public class rekrusif_Bercabang {
    private static int reksrusif(int n,String nama){
        System.out.println("daun "+nama);
        System.out.println("FIBBONACI KE-"+n);
        if (n==1||n==0) {//memiliki dua return
            return 0;
        }else{
            return reksrusif(n-1, "kiri")+reksrusif(n-2, "kanan");
        }
     }
     public static void main(String[] args) {
           reksrusif(5, "atas");
     }
}
