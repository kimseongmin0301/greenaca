package Exam;

import java.util.Scanner;

public class Member {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String id = sc.next();

        MemberService user1 = new MemberService(name,id);

        if(user1.login(name,id))
            user1.logout(name);
    }
}

class MemberService{
    private String name;
    private String id;
    private String password;
    private int age;

    MemberService(String name, String id){
        this.name = name;
        this.id = id;
    }

    private boolean result;
    public boolean login(String id, String password){
        if(id.equals("hong") && password.equals("12345")){
            result = true;
        }else{
            result = false;
        }
        return result;
    }

    public void logout(String id){
        System.out.println("유저 ID: "+ id + " 로그아웃 되었습니다.");
    }
}