package String;

import java.util.Formatter;

public class formatString {
    public static void main(String[] args) {
        // membahas System.out.println/printf();
       //conversion : integer = d,x,o,i,u |float/double = f,e,g,a |String = s |Boolean = b |char = c 
       int nilai = 100,harga = 1213000,value = -32847678;
       float IPK = 3.3220f;
       String nama = "Puji santoso";
       char sikap = 'A';

        //Struktur format =%[argumen_indeks($)][flags][width][.precision]conversion
       //format biasa
       System.out.printf("nama :%s\nnilai :%d\nIPK :%f\nsikap :%c\n\n",nama,nilai,IPK,sikap);
       
       //[argumen_indeks($)]
       System.out.println("argumen indeks");
       System.out.printf("nama saya %1$s \nnama aku %1$s\nnama gua %s\n\n",nama);
       System.out.printf("nama saya %s nilai saya %3$d,dengan nilai %3$d saya berhasil meraih peringkat 1\nIPK saya %2$.2f\nnama :%1$s\nnilai :%3$d\nIPK :%2$.2f\n\n",nama,IPK,nilai);
       
       //[flags]
       System.out.println("flags");
       System.out.printf("%+d\n",value);
       
       //[width]
       System.out.println("width");
       System.out.printf("%0,12d\n",harga);
       System.out.printf("%(+,1d\n",value);
       System.out.printf("%-15s",nama);
       
       //floating point ? memiliki 6 desimal di belakang koma
       //[.precision]
       String nama2="  Riyana     ";
       System.out.println("[.precision]");
       System.out.printf("%010.2f\n",IPK);
       //delete leading ? .trim
       System.out.print("|"+nama2+"|  ");
       System.out.print("|"+nama2.trim());
       System.out.println("|");
      
       //cara lain 
       String data = "nama : "+nama+" IPK : "+IPK;//String biasa
       String data2 = String.format("nama %s |IPK %2$.2f",nama,IPK);//String format
       StringBuilder data3 = new StringBuilder();//StringBuilder
       Formatter formatBuilder = new Formatter(data3);
       formatBuilder.format("nama %s |IPK %2$.2f",nama,IPK);
       System.out.println(data);//string biasa
       System.out.println(data2);//string format
       System.out.println(data3);//string builder
       formatBuilder.close();

    }
}
