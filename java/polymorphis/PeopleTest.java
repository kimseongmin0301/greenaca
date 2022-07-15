package polymorphis;

public class PeopleTest {
    public static void main(String[] args) {
//        Woman w = new Woman();
//
//        Man m = new Man();
//
//        m.printInfo();
//        w.printInfo();
//
//        People p = new People();

        People p = new Man();
        p.printInfo();
        ((Man)p).enlist();

        p = new Woman();
        p.printInfo();
        ((Woman)p).makeup();

    }
}
