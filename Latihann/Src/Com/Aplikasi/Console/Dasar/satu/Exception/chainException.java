package Exception;
import java.util.Scanner;

public class chainException {
    public static void main(String[] MethodException) {
        Scanner scanner = new Scanner(System.in);
        int isi = scanner.nextInt();
        int [] array = {0,1,2,3,4,5};
       int data= exception(array, isi);
        System.out.printf("data dari %d adalah %d\n",isi,data);
        System.out.println();
        //cara lain
        int data2 = 0;
        try {
            data2=exception2(array, isi);
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.printf("data dari %d adalah %d\n",isi,data2);
        System.out.println("program selesai");
        scanner.close();
    }

    public static int exception2(int[] args,int arg)throws ArrayIndexOutOfBoundsException {
        int hasil =args[arg];
        return hasil;
    }

    public static int exception(int[] args,int arg) {
        int hasil = 0;
        try {
            hasil = args[arg];
            System.out.println(hasil);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println(e);
        }return hasil;
    }
}