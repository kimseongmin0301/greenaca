package Exam;

import java.util.Scanner;

public class Exam0708 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Exam0708 exam = new Exam0708();

        exam.Ex1();
        exam.Ex2();
        exam.Ex3();
        exam.Ex5();
    }

    private void Ex1(){
        Calculator cal = new Calculator();

        System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요");

        int first = sc.nextInt();
        String oper = sc.next();
        int second = sc.nextInt();

        switch(oper){
            case "+":
                System.out.println("연산결과는 " + cal.getAdd(first,second));
                break;
            case "-":
                System.out.println("연산결과는 " + cal.getSub(first,second));
                break;
            case "*":
                System.out.println("연산결과는 " + cal.getMul(first,second));
                break;
            case "/":
                System.out.println("연산결과는 " + cal.getDiv(first,second));
                break;
        }
    }

    private void Ex2(){
        Calculator cal = new Calculator();

        System.out.println("");
        System.out.println("오버라이딩");
        System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요");
        int first =  sc.nextInt();
        String oper = sc.next();
        int second =  sc.nextInt();
        double df = first;
        double ds = second;

        switch(oper){
            case "+":
                System.out.println("연산결과는 " + cal.playNum(first,second));
                break;
            case "-":
                System.out.println("연산결과는 " + cal.playNum(df,second));
                break;
            case "*":
                System.out.println("연산결과는 " + cal.playNum(first,ds));
                break;
            case "/":
                System.out.println("연산결과는 " + cal.playNum(df,ds));
                break;
        }
    }

    private void Ex3(){
        int first = sc.nextInt();
        int second = sc.nextInt();
        int sum = 0;

        if(first < second) {
            for (int i = first; i <= second; i++) {
                sum += i;
            }
        }else {
            for (int i = second; i <= first; i++) {
                sum += i;
            }
        }

        System.out.println("--------------------");
        System.out.println("a " + "b " + "result");
        System.out.println("--------------------");
        System.out.println(first+ " " + second+ " " + sum);
    }

    private void Ex5(){
        Student stu = new Student();

        stu.getTotal();
        stu.getAverage();
    }
}

class Calculator{
    static int getAdd(int x, int y){
        return x + y;
    }
    static int getSub(int x, int y){
        return x - y;
    }
    static int getMul(int x, int y){
        return x * y;
    }
    static double getDiv(double x, double y){
        return x / y;
    }

    static int playNum(int x, int y){
        return x + y;
    }
    static double playNum(double x, int y){
        return x - y;
    }
    static double playNum(int x, double y){
        return x * y;
    }
    static double playNum(double x, double y){
        return x / y;
    }
}

class Student{
    private static Scanner sc = new Scanner(System.in);
    private String name;
    private int	ban;
    private int	no;
    private int	kor;
    private int	eng;
    private int	math;

    static void getTotal(){
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        float sum = (kor + eng + math);

        System.out.println("총합은 : " + sum);
    }

    static void getAverage(){
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();
        int sum = kor + eng + math;

        System.out.println("평균값은 : " + (float)(Math.round((sum/3f) * 10))/ 10);
    }

}