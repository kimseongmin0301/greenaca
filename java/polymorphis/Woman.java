package polymorphis;

public class Woman extends People{
    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("그리고 여자입니다.");
    }
    void makeup(){
        System.out.println("메이크업");
    }
}
