package cassting;

public class casting {
    public static void main(String args[]) {
        // casting otomatis byte>short>char>int>long>float>double
        byte byte1 = 3;
        short short1 = byte1;
        System.out.println(short1);
        double double1 = byte1;
        System.out.println(double1);
        System.out.println();
        // casting manual double>float>long>int>char>short>byte>
        long long1 = 1000000;
        byte byte2 = (byte) long1;
        System.out.println(byte2);
        double double2=39.2;
        int int1=(int)double2;
        System.out.println(int1);
        System.out.println();
        //casting String
        char char1='d';
        String string1=""+char1;//slowest+memory tidak efisien
        System.out.println(string1);
        String string2=String.valueOf(char1);//fasted+memory efisien
        System.out.println(string2);
    }
}
