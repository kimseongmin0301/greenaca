package object;

public class CalculatorTest {
    public static void main(String[] args) {
//        Calculator cal = new Calculator();
        System.out.println(Calculator.add(10,20));
    }
}

class Calculator {
    static int add(int x, int y) {
        return x + y;
    }
}