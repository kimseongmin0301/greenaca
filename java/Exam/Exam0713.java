package Exam;

import java.util.Scanner;

public class Exam0713 {
    public static void main(String[] args) {
        SubEntry entry = new SubEntry("OOP","Object Oriented Programming", 1991);
        entry.PrintView();

        SubHealth health = new SubHealth();
        health.input();
        health.calculate();
        health.output1();
        health.output2();
    }
}

class Entry{
    String word;
    Entry(){

    }
    Entry(String w){
        this.word = w;
    }
    public void PrintView(){
        System.out.println("*****약어사전******");
        System.out.println("약어 : " + this.word);
    }

}
class SubEntry extends Entry{
    String definition;
    int year;

    SubEntry(String w){
        super(w);
    }
    SubEntry(String w, String d, int y){
        super(w);
        this.definition = d;
        this.year = y;
    }

    @Override
    public void PrintView(){
        System.out.println("*****약어사전******");
        System.out.println("약어 : " + super.word);
        System.out.println("원어 : " + this.definition);
        System.out.println("시기 : " + this.year + "년");
    }
}

class Health{
    char gender;
    double tall;
    double weight;

    Health(){}
    void input(){
        Scanner sc = new Scanner(System.in);
        gender = sc.next().charAt(0);
        tall = sc.nextDouble();
        weight = sc.nextDouble();
    }

    void output1(){
        System.out.println("***** 비만도 Check *****");
        System.out.println("성별(M/F) : " + this.gender);
        System.out.println("신장(Cm) : " + this.tall);
        System.out.println("체중(Kg) : " + this.weight);
    }
}
class SubHealth extends Health{
    double s_weight;
    double fat;
    String result;

    SubHealth(){
        this.s_weight = 0.0;
        this.fat = 0.0;
        this.result = null;
    }

    void calculate(){
        if(super.gender == 'M' || super.gender == 'm'){
            s_weight = (super.tall-100) * 0.9;
        }else if(super.gender == 'F' || super.gender == 'f'){
            s_weight = (super.tall-100) * 0.85;
        }
        fat = super.weight / s_weight * 100;

        if (fat <= 90) {
            result = "저체중";
        }else if(fat >= 121 && fat <= 130){
            result = "경도비만";
        }else if(fat >90 && fat<= 110){
            result = "정상(표준체중)";
        }else if(fat >=131 && fat <=150){
            result = "중도비만";
        }else if(fat >= 111 && fat <=120){
            result = "과체중";
        }else{
            result = "고도비만";
        }
    }
    void output2(){
        System.out.println("성별 - " + super.gender);
        System.out.println("신장 - " + super.tall + "Cm");
        System.out.println("체중 - " + super.weight + "Kg");

        System.out.println("당신의 비만도는 " + Math.round(fat*100)/100.0 + "이고, " + result + "입니다.");
    }
}