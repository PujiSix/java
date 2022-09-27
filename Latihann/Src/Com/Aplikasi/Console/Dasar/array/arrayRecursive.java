package Latihann.Src.Com.Aplikasi.Console.Dasar.array;
//array menggunakan tipe memori heap yang mana akan secara acak menempatkan data ke dalam memori
public class arrayRecursive {
    private static int array(int a){
        int[] arr=new int[4];
        arr[0]=1;
        arr[1]=122;
        arr[2]=12;
        System.out.println(arr);//memori heap
        if(arr[a]==1){
            return arr[0];
        }if(arr[a]==arr[1]){
            return arr[2];
        }else{
            return arr[1];
        }
    }
    public static void main(String[] args) {
      int hasil =  array(1);
      System.out.println(hasil);
      
    }
}
