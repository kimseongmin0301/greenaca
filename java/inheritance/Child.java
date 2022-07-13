package inheritance;
//자식
public class Child extends Parents{
    int x = 20;
    void method(){
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}
