package polymorphis;

public class Man extends People{
    @Override
    void printInfo(){
        super.printInfo();
        System.out.println("그리고 남자입니다.");
    }
    void enlist(){
        System.out.println("군대감");
    }
}
