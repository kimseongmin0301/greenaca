package loop;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean banking = true;
        int money =0;
        int withdraw = 0;
        int total = 0;
        while(banking){
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
            System.out.println("----------------------------------");
            int answer = sc.nextInt();

            switch(answer) {
                case 1:
                    System.out.print("예금 금액 : ");
                    money = sc.nextInt();
                    total += money;
                    break;
                case 2:
                    System.out.print("출금 금액 : ");
                    withdraw = sc.nextInt();
                    total -= withdraw;
                    break;
                case 3 :
                    System.out.print("잔고 : " + total);
                    break;
                case 4 :
                    System.out.print("종료하겠습니다.");
                    banking = false;
                    break;
            }
        }
    }
}
