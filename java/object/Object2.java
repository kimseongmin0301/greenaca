package object;

public class Object2 {
    public static void main(String[] args) {
        ObjectEx oj = new ObjectEx();
        ObjectEx ob = new ObjectEx();
        System.out.println(oj.width);
        System.out.println(ob.width);


        oj.width = 100;

        System.out.println(oj.width);
        System.out.println(ob.width);

    }
}
