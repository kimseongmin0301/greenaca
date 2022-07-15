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

        //타입 = People
        People p = new Man();
        p.printInfo();
        ((Man)p).enlist();

        p = new Woman();
        p.printInfo();

        //타입변환 해줘야함. 부모클래스에는 makeup이 없기때문
        ((Woman)p).makeup();

    }
}
