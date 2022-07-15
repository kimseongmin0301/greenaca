package polymorphis;

//main
public class ProByuTest{
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Computer());
        b.buy(new Tv());
    }
}

//제품 객체
class Product {
    //제품가격
    int price;

    Product(int price){
        this.price = price;
    }
}

//제품 사는 사람 객체
class Buyer{
    int money=1000;

    void buy(Product p){
        money -= p.price;
        System.out.println(p.getClass().getSimpleName() + "제품을 구입하셨습니다.");
        System.out.println("가격은 " + p.price + "만원 입니다.");
        System.out.println("남은 가격은 " + money + "만원 입니다.");
    }
}

class Computer extends Product{
    Computer() {
        super(200);
    }
}

class Tv extends Product{
    Tv(){
        super(100);
    }
}