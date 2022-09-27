package String;

public class stringMemory {
    public static void main(String[]MemoryString) {
        String satu="Minato";
        String dua=new String("Minato");
        String tiga="Minato";
        String empat="Dinato";
        System.out.println("satu = "+satu);
        //satu="d"+satu.substring(0,2);
        memory(satu);//memory string pool
        memory(dua);//memory heap
        memory(tiga);//memory string pool
        satu="D"+satu.substring(1);//.substring merupakan method
        memory(satu);//memory akan berbeda karena terdapat method
        memory(empat);
    }
    public static void memory(String args) {//mengetahui memory
        int addres = System.identityHashCode(args);
        System.out.println(args+" = "+Integer.toHexString(addres));
        
    }
}
