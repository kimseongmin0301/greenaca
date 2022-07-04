package variable;

public class Casting {
    public static void main(String[] args) {

        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 100000L;

//        b = (byte)i;
//        ch = (char)b;x
//        short s = (short)ch;x
        float f = l;
//        i = (int)ch;o

//        System.out.println(b);
//        System.out.println(ch);
//        System.out.println(s);
        System.out.println(f);
//        System.out.println(i);

    }
}
