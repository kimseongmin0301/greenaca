import java.util.*;
import java.util.Scanner;

class Student{
    private String name;
    private int year;
    private String dept;

    public Student(String name, int year, String dept) {
        this.name = name;
        this.year = year;
        this.dept = dept;
    }

    public String getDept() {
        return this.dept;
    }
    public int getYear() {
        return this.year;
    }

}
class StudentMidExam {

    static int ssu;
    static Student[] data;
    static Scanner sc = new Scanner(System.in);


    public static int findStudentSu(String deptName) {
        int i, su=0;

        for(Student temp : data) {
            if(temp.getDept().equals(deptName))
                su++;
        }
        return su;
    }
    public static int maxYear() {
        int index=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(Student temp : data) {
            hm.put(temp.getYear(), hm.getOrDefault(temp.getYear(), 0) +1);
        }
        for(Integer key:hm.keySet()) {
            if(hm.get(key)>index) {
                index=key;
            }

        }
        return index;
    }


    public static void main(String[] args) {
        int year, su;
        String name, dept;

        System.out.print("학생수:");
        ssu = Integer.parseInt(sc.nextLine());
        data = new Student[ssu];
        for(int i=0; i<ssu; i++) {
            System.out.print("학생이름:");
            name = sc.nextLine();
            System.out.print("학과:");
            dept = sc.nextLine();
            System.out.print("학년:");
            year = Integer.parseInt(sc.nextLine());
            data[i] = new Student(name, year, dept);
        }

        System.out.println("찾고 싶은 학과 이름");
        name = sc.nextLine();
        su = findStudentSu(name);
        System.out.println(name + "과 소속의 학생은 " + su +"명 입니다.");
        int index = maxYear();

        System.out.print("가장 많은 학생의 학년은 "+index+"입니다.");
    }
}