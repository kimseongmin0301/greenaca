import java.util.Arrays;
import java.util.Scanner;

public class Test0712 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Test0712 test = new Test0712();

        test.Exam();
    }

    private void Exam() {
        int select = 0;
        int stu = 0;
        int chk;
        int [] arr;
        boolean checked = false;
        while(true){
            chk = 0;
            System.out.println("실행 결과");
            System.out.println("----------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------");
            System.out.println("선택 >");

            if(!checked) {  select = sc.nextInt();   }
            if(!checked && select == 1){
                System.out.println("학생수 >");
                stu = sc.nextInt();
                arr = new int[stu];
                if(stu<=0) {
                    System.out.println("잘못입력했어 다시");
                    continue;
                }
                checked = true;
                chk = -1;
            }

            if(checked && chk == 0){
                int afSelect = sc.nextInt();
                if(afSelect == 1){
                    checked = false;
                }else if(afSelect == 2){
                    System.out.println(stu + "개의 점수입력");
                    for(int i=0; i<stu; i++){
                        arr[i] = sc.nextInt();
                    }
                }else if(afSelect == 3){
                    for(int i=0; i<stu; i++) {
                        System.out.println((i + 1) + "번째 학생 : " + arr[i]);
                    }
                }else if(afSelect == 4){
                    Arrays.sort(arr);
                    System.out.println("최고 점수 : " + arr[stu - 1]);
                    System.out.println("평균 점수 : " + avg(arr));
                }else if(afSelect == 5){
                    System.out.println("프로그램 종료");
                    break;
                }
            }

        }
    }

    double avg(int avg[]){
        int sum = 0;
        for(int i=0; i<avg.length; i++){
            sum += avg[i];
        }
        return sum/avg.length;
    }
}
