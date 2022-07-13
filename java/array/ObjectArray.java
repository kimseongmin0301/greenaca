package array;

import java.util.Scanner;

public class ObjectArray {
    private int sum;
    private String name;

    ObjectArray(){}

    ObjectArray(String name, int sum){
        this.name = name;
        this.sum = sum;
    }
    String getName(){ return this.name; }
    int getSum(){return this.sum;}
    void show(){
        System.out.println(getName() + "," + getSum());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ObjectArray[] arr = new ObjectArray[5];

        String name;
        int sum;

        for(int i=0; i<5; i++){
            name = sc.next();
            sum = sc.nextInt();
            arr[i] = new ObjectArray(name, sum);
        }
        for(ObjectArray a : arr){
            a.show();
        }
    }
}
