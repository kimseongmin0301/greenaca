package Exam;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 객체배열
 */
public class Exam0714_2 {
    private static ArrayList<BankApplication> bank = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    private static int count = 0;

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            System.out.println("===============================");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료|");
            System.out.println("===============================");
            System.out.println("선택> ");
            int select = sc.nextInt();

            if (select == 5) {
                run = false;
            } else if (select == 1) {
                createAccount();
            } else if (select == 2) {
                accountList();
            } else if (select == 3) {
                deposit();
            } else if (select == 4) {
                withdraw();
            }
        }
        System.out.println("프로그램 종료");
    }

    private static void createAccount() {
        System.out.println("---------");
        System.out.println("계좌생성");
        System.out.println("---------");
        System.out.println("계좌번호 : ");
        String bankNum = sc.next();
        System.out.println("계좌주 : ");
        String name = sc.next();
        System.out.println("초기입금액 : ");
        int money = sc.nextInt();

        if (findBankNum(bankNum)) {
            bank.add(new BankApplication(bankNum, name, money));
            count++;
        } else {
            System.out.println("계좌 생성 실패. 동일 계좌 존재");
        }
    }

    private static void accountList() {
        System.out.println("---------");
        System.out.println("계좌목록");
        System.out.println("---------");
        for (int i = 0; i < count; i++)
            System.out.println(bank.get(i).getBankNum() + " " + bank.get(i).getName() + " " + bank.get(i).getMoney());
    }

    private static void deposit() {
        System.out.println("---------");
        System.out.println("예금");
        System.out.println("---------");
        System.out.println("계좌번호 : ");
        String bankNum = sc.next();

        BankApplication account = findAccount(bankNum);
        if(account != null){
            System.out.println("예금액 : ");
            int money = sc.nextInt();

            account.setMoney(account.getMoney() + money);

            System.out.println("결과 : 예금완료");
            System.out.println("잔고 금액 : " + account.getMoney());
        }else{
            System.out.println("찾는 계좌번호가 없습니다.");
        }
    }

    private static void withdraw() {
        System.out.println("---------");
        System.out.println("출금");
        System.out.println("---------");
        System.out.println("계좌번호 : ");
        String bankNum = sc.next();

        BankApplication account = findAccount(bankNum);
        if(account != null){
            System.out.println("출금액 : ");
            int money = sc.nextInt();

            if (account.getMoney() - money >= 0) {
                account.setMoney(account.getMoney() - money);
                System.out.println("출금 완료.");
                System.out.println("잔고 금액 : " + account.getMoney());
            } else {
                System.out.println("출금 실패. 계좌에 잔고가 부족합니다.");
            }
        }else{
            System.out.println("찾는 계좌번호가 없습니다.");
        }
    }

    private static BankApplication findAccount(String BankNum) {
        BankApplication account = null;
        for (int i = 0; i < count; i++) {
            if (bank.get(i).getBankNum().equals(BankNum)) {
                account = bank.get(i);
                break;
            }
        }
        return account;
    }

    private static boolean findBankNum(String BankNum) {
        for (int i = 0; i < count; i++) {
            if (BankNum.equals(bank.get(i).getBankNum())){
                return false;
            }
        }
        return true;
    }
}

class BankApplication{
    private String bankNum;
    private String name;
    private int money;

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