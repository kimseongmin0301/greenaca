package Exam;

public class Exam0711 {
    public static void main(String[] args) {
        StudaCard card1 = new StudaCard(3, false);
        StudaCard card2 = new StudaCard();
        System.out.println(card1.info()); //3
        System.out.println(card2.info()); //1k
    }
}

class StudaCard{
    private int num;
    private boolean isKwang;

    StudaCard(){
        this(1,true);
    }
    StudaCard(int num, boolean Kwang){
        this.num = num;
        this.isKwang = Kwang;
    }
    String info(){
        return this.isKwang ? this.num + "K" : this.num + "";
    }
}