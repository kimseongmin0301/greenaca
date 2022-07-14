package Exam;

import java.util.Scanner;

/**
 * 객체배열
 */
public class Exam0714_2 {
    static BankApplication[] bank  = new BankApplication[10];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bankNum, name;
        int money;
        int count = 0; //반복 카운트

        while(true) {
            System.out.println("===============================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료|");
            System.out.println("===============================");
            System.out.println("선택> ");
            int select = sc.nextInt();

            if (select == 5) {
                System.out.println("프로그램 종료");
                break;
            } else if (select == 1) {
                System.out.println("---------");
                System.out.println("계좌생성");
                System.out.println("---------");
                System.out.println("계좌번호 : ");
                bankNum = sc.next();
                System.out.println("계좌주 : ");
                name = sc.next();
                System.out.println("초기입금액 : ");
                money = sc.nextInt();
                bank[count] = new BankApplication(bankNum, name, money);
                count++;
            } else if (select == 2) {
                System.out.println("---------");
                System.out.println("계좌목록");
                System.out.println("---------");
                for(int i=0; i<count;i++)
                    System.out.println(bank[i].getBankNum()+ " " + bank[i].getName() + " " + bank[i].getMoney());
            }else if(select == 3){
                System.out.println("---------");
                System.out.println("예금");
                System.out.println("---------");
                System.out.println("계좌번호 : ");
                bankNum = sc.next();
                System.out.println("예금액 : ");
                money = sc.nextInt();
//                for(int i=0; i<count;i++) {
//                    if (bankNum.equals(bank[i].getBankNum()))
//                        bank[i] = new BankApplication(bankNum, bank[i].getName(), bank[i].getMoney() + money);
//                }
                for(int i=0; i<count;i++) {
                    if (bankNum.equals(bank[i].getBankNum()))
                        bank[i].setMoney(bank[i].getMoney() + money);
                }

                System.out.println("결과 : 예금완료");
            }else if(select == 4){

                System.out.println("---------");
                System.out.println("출금");
                System.out.println("---------");
                System.out.println("계좌번호 : ");
                bankNum = sc.next();
                System.out.println("출금액 : ");
                money = sc.nextInt();
//                for(int i=0; i<count;i++) {
//                    if (bankNum.equals(bank[i].getBankNum()))
//                        bank[i] = new BankApplication(bankNum, bank[i].getName(), bank[i].getMoney() - money);
//                }
                for(int i=0; i<count;i++) {
                    if (bankNum.equals(bank[i].getBankNum()))
                        if(bank[i].getMoney() - money < 0)
                            System.out.println("결과 : 출금실패");
                        else
                            System.out.println("결과 : 출금완료");
                        
                    bank[i].setMoney(bank[i].getMoney() - money);
                }
            }
        }
    }
}

class BankApplication{
    private String bankNum;
    private String name;
    private int money;

    BankApplication(){}
    BankApplication(String bankNum, String name, int money){
        this.bankNum=bankNum;
        this.name=name;
        setMoney(money);
    }

    public String getBankNum() {
        return bankNum;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if(money >= 0)
            this.money = money;
    }
}