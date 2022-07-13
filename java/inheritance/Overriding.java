package inheritance;

public class Overriding {
    public static void main(String[] args) {
        OverridingChild od = new OverridingChild();
        od.x=10;
        od.y=20;
        od.z=30;
        System.out.println(od.add());
    }
}
class OverridingParents{
    int x, y;
    int add(){
        return x+y;
    }
}

class OverridingChild extends OverridingParents{
    int z;

    /**
     * 오버라이딩
     * 1. 메소드 이름이 같아야 함.
     * 2. 매개변수가 같아야 함.
     * 3. 리턴타입이 같아야 함.
     */
    @Override //적어줘야 남들이 오버라이딩한걸 알기쉬움
    int add() {
        return x + y + z;
    }
}
