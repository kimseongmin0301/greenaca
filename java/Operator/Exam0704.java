package Operator;

import java.util.Scanner;

public class Exam0704 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Exam0704 exam = new Exam0704();

        exam.Ex1();
        exam.Ex2();
        exam.Ex3();
        exam.Ex4();
    }
    private void Ex1(){
        int apple = 123;
        int basket = 10;
        int cnt = apple / basket;

        if(apple % basket != 0){
            cnt += 1;
        }

        System.out.println(cnt);
    }
    private void Ex2(){
        String posNum = "양수", negNum = "음수", zero = "0";
        int num = sc.nextInt();

        String answer = num>0 ? posNum:  num < 0 ? negNum : zero;

        System.out.println(answer);
    }
    private void Ex3(){
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);

        char ch = 'A';
        ch += 2;

        float f = 3/2f;
        long l = 3000* 3000* 3000L;

        float f2 = 0.1f;
        double d = 0.1f;

        boolean result = d == f2;

        System.out.println(c);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(l);
        System.out.println(result);
    }
    private void Ex4(){
        char ch = sc.next().charAt(0);
        boolean b = false;

        if((ch>64 && ch<91) || (ch >96 && ch <123) || (ch>47 && ch<58)) {
            b= true;
        }

        System.out.println(b);
    }
}
