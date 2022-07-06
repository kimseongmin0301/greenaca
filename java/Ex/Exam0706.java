package Ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam0706 {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Exam0706 ex = new Exam0706();

        ex.ex1();
        ex.ex2();
        ex.ex3();
        ex.ex4();
        ex.ex5();
        ex.ex6();
    }

    private void ex1(){
        int sum = 0;
        for(int i=1; i<=100; i++){
            if(i%3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private void ex2(){
        while(true) {
            int first = (int) (Math.random() * 6) + 1;
            int second = (int) (Math.random() * 6) + 1;

            System.out.println("("+first+","+second+")");
            if(first + second == 5){
                break;
            }
        }
    }

    private void ex3(){
        int money = 59780;
        int[] coin = {10000,5000,1000,500,100,10};
        int out;
        for (int num : coin) {
            out = money / num;
            money -= num * out;

            System.out.println(num + "원 : " + out);
        }
    }

    private void ex4(){
        int in = sc.nextInt();
        int num = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1; i<=in; i++){
            if(in % i == 0){
                arr.add(i);
                num++;
            }
        }
        System.out.print("{");
        for(int i=0; i<num; i++){
            if(num != i + 1) {
                System.out.print(arr.get(i));
                System.out.print(", ");
            }
            else{
                System.out.print(arr.get(i));}
        }
        System.out.println("}");
        System.out.println("약수의 개수는 "+num+"개 입니다.");
    }
    private void ex5(){
        int odd=0, even=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<5; i++){
            int num = sc.nextInt();
            arr.add(num);
        }

        for (Integer num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("홀수 개수는 : " + odd + " 짝수 개수는 : "+ even);
    }

    private void ex6(){
        int num = (int)(Math.random()*100)+1;
        int cnt = 0;
        while(true){
            System.out.println("1과 100 사이의 값을 입력하세요 : ");
            int in = sc.nextInt();
            cnt++;
            if(num > in){
                System.out.println("더 큰수를 입력하세요");
            }else if(num < in){
                System.out.println("더 작은 수를 입력하세요");
            }else{
                System.out.println("맞췄습니다.");
                System.out.println("시도횟수는 " + cnt + "번 입니다.");
                break;
            }
        }
    }
}
