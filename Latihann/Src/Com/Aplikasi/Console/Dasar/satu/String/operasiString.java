package String;

public class operasiString {
    public static void main(String[] args) {
      //membuat boros memori
        String kalimat ="Mereka Mereka";

        //mengambil komponen dari string menggunakan charAt
        System.out.println(kalimat.charAt(0)+"\n");

        //mengambil komponen dari string menggunakan substring
        System.out.println(kalimat.substring(0,3)+"\n");

        //concatenation = menggabungkan /membuat memori baru di string pool
        String kalimat1 =kalimat+" ga tau";
        System.out.println(kalimat1+"\n");

        //lowercase dan uppercase
        System.out.println("Lowercase dan Uppercase");
        System.out.println(kalimat1.toLowerCase());
        System.out.println(kalimat1.toUpperCase()+"\n");

        //replace ? mengganti komponen dengan komponen yang lain
        String kalimat2= kalimat;
        System.out.println(kalimat2.replace("Mer", "Merd")+"\n"); 

        //equality(persamaan) ? mengecek persamaan antara dua buah string
        //untuk pengecekan string yang di cek adalah addresnya
       String kalimat3 = new String("sehat");//Heap
        //String kalimat3="sehat";
        Memory(kalimat3);
        System.out.println("=======");
        String kalimat4 ="sehat";//String pool
        Memory(kalimat4);
        if (kalimat3==kalimat4) {
            System.out.println("sama\n");
        } else {
            System.out.println("tidak sama\n");
        }
        
      //compare
      if (kalimat3.compareTo(kalimat4)==0) {
        System.out.println("sama");
      } else {
        System.out.println("tidak sama");
      }
    }
    public static void Memory(String args) {
        int addres = System.identityHashCode(args);
        System.out.println(args+" = "+Integer.toHexString(addres));
    }
}
