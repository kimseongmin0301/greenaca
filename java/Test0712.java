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
        int cnt = 0;
        int restart = 0;
        int [] arr = null;
        boolean checked = false;

        while(true){
            cnt++;
            System.out.println("실행 결과");
            System.out.println("----------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------");

            if(!checked && cnt == 1 && restart == 0) {  
                select = sc.nextInt();   
                restart = 1;
            }

            if(select == 1){
                if(!checked){
                    System.out.println("학생수 >");
                    stu = sc.nextInt();
                }
                
                if(stu<=0) {
                    System.out.println("잘못입력했어 다시");
                    continue;
                }else{
                    checked = true;
                }
                        
                if(cnt > 1){
                    int afSelect = sc.nextInt();
                    if(afSelect == 1){
                        checked = false;
                        cnt=0;
                    }else if(afSelect == 2){
                        arr = new int[stu];
                        System.out.println(stu + "개의 점수입력");
                        for(int i=0; i<stu; i++){
                            arr[i] = sc.nextInt();
                        }
                    }else if(afSelect == 3){
                        if(arr != null){
                            for(int i=0; i<stu; i++) {
                                System.out.println((i + 1) + "번째 학생 : " + arr[i]);
                            }
                        }else{
                            System.out.println("점수를 먼저 넣어");
                        }
                    }else if(afSelect == 4){
                        if(arr != null){
                            Arrays.sort(arr);
                            System.out.println("최고 점수 : " + arr[stu - 1]);
                            System.out.println("평균 점수 : " + avg(arr));
                        }else{
                            System.out.println("점수를 먼저 넣어");
                        }
                    }else if(afSelect == 5){
                        System.out.println("프로그램 종료");
                        break;
                    }
                }
            }else if(select == 2 || select == 3 || select ==4){
                System.out.println("학생수부터 입력하세요");
                cnt--;
                restart = 0;
            }else{
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    double avg(int[] avg){
        double sum = 0;
        for (int i : avg) { sum += i; }
        return sum/avg.length;
    }
}
