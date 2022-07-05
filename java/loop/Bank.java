package loop;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean banking = true;

        while(banking){
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 조회 | 4. 종료");
            System.out.println("----------------------------------");
            int answer = sc.nextInt();

            switch(answer) {
                case 1:
                    System.out.println("예금액 : 10000");
                    break;
                case 2:
                    System.out.println("출금액 : 2000");
                    break;
                case 3 :
                    System.out.println("잔고 : 8000");
                    break;
                case 4 :
                    System.out.println("종료하겠습니다.");
                    banking = false;
                    break;
            }
        }
    }
}
