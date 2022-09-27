import java.util.Scanner;
public class Puji_1850_1 {
    public static void main(String[] tugasPertama){
     Scanner input = new Scanner(System.in);
     System.out.println("TUGAS 1 tanggal 12 september 2022");
     System.out.print("masukan angka pertama : ");int a=input.nextInt();//variabel a 
     System.out.print("masukan angka kedua : ");int b=input.nextInt();//variabel b
     int hasil = 0;//variabel hasil 
     for(int i = 1;i<=b;i++){
        hasil+=a;//hasil yang semulanya bernilai nol akan di tambah dengan nilai input yang sudah di simpan ke dalam variabel a 
                //sebanyak nilai input variabel b
        if(hasil%b==0){//jika nilai dari hasil yang sudah di tambah dengan variabel a kemudian di modulus dengan b dan menghasilkan nilai 0 
            System.out.println(hasil);//print hasil 
            break;//untuk menghentikan program
        }
     }
      input.close();//untuk menutup scanner supaya tidak terjadi kebocoran memori yang akan menyebabkan memori cepat habis
    }
}