package String;

import java.lang.StringBuilder;

public class stringBuilder {
    public static void main(String[] args) {
        // String satu="halo";
        // System.out.println(satu.length());
        StringBuilder satu1 = new StringBuilder("Disitulah");
        printData(satu1);

        // append = menambahkan ? hanya menambahkan di belakang string //memori tetap tidak seperti concat
        System.out.println("append");
        satu1.append(" nama saya puji santoso dari jakarta");
        printData(satu1);

        //insert = menambahkan ? di index tertentu
        System.out.println("insert"); 
        satu1.insert(0, "pagi ");
        printData(satu1);

        //delete = menghapus ? di index tertentu
        System.out.println("delete"); 
        satu1.delete(0, 5);
        printData(satu1);

        //merubah character pada index tertentu
        System.out.println("setCharAt");
        satu1.setCharAt(0,'K');
        printData(satu1);

        //replace
        System.out.println("replace");
        satu1.replace(0, 5, "ohayo");
        printData(satu1);

        //casting menjadi String
        System.out.println("casting");
        String temp = satu1.toString();
        System.out.println(temp);

        int addresString=System.identityHashCode(temp);
        System.out.println("memori = "+addresString);
    }

    public static void printData(StringBuilder data) {
        System.out.println("data builder = " + data);
        System.out.println("panjang data = " + data.length());
        System.out.println("kapasitas data = " + data.capacity());
        int add = System.identityHashCode(data);
        System.out.println("memori = " + Integer.toHexString(add) + "\n");
    }
}
//stringBuilder digunakan saat ada data dengan tipe data String yang banyak