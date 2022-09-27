import java.util.Scanner;//class Scanner untuk mengambil input dari user
public class Puji_1850_3{
    public static void main(String[]args){
        System.out.println("tugas 2 tanggal 19/9/2022");
        System.out.println("array 1 dimensi");
        int data[]={3,9,76,54,43,12,46,39,76,12,88,45,89};//array dengan tipe data integer yang sudah terdapat isinya
        int i,x;//variabel i dan x
        try (Scanner s = new Scanner(System.in)) {
            for(i=0;i<data.length;i++){//perulangan for sebanyak panjang elemen array data
            System.out.println("nilai a["+i+"] = "+data[i]);//array data index ke-i akan menampilkan data yang sudah di inisialisasi sebelumnya
            }
            System.out.println("Masukan angka yang ingin dicari : ");
            x=s.nextInt();//inputan dari Scanner s dengan tipe data integer
        }
        int j =0;//variabel j dengan nilai 0
        for (i=0;i<data.length;i++){//perulangan for sebanyak panjang elemen array data
            if (x==data[i]){//pengkondisian if jika x sama dengan data index ke i maka akan memunculkan pesan di bawah
                System.out.println("Ada pada elemen ke-"+(i));
                j++;//increment dari variabel j
            }
        }
        if(j==0) {System.out.println("data tidak ditemukan");}//pengkondisian if jika j sama dengan 0 maka akan memunculkan pesan 
        
    }
    
}