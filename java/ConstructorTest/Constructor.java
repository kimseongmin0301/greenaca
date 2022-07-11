package ConstructorTest;

public class Constructor {
    public static void main(String[] args) {
        ConstructorTest c = new ConstructorTest(10,20,30);
        ConstructorTest c1 = new ConstructorTest();


        System.out.println(c);
        System.out.println(c1);
    }
}

class ConstructorTest{
    int a;
    int b;
    int c;
    ConstructorTest(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    ConstructorTest(){
        this(10,20,30);
    }
}
