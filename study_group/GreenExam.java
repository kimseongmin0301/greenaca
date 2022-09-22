import java.util.*;

public class GreenExam {
    public static void main(String[] args) {
        GreenExam greenExam = new GreenExam();
//        greenExam.ex1();
//        greenExam.ex2();
//        greenExam.ex3();
    }

    private void ex1(){
        //배열 값 선언
        int[] arr = {4, 7, 12};
        boolean[] check = {true, false, true};

        int result = 0;

        //check 후 계산
        for(int i=0; i<arr.length; i++){
            if(check[i]){
                result += arr[i];
            }else{
                result -= arr[i];
            }
        }

        System.out.println(result);
    }
    private void ex2(){
        //배열 값 선언
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        ArrayList<Integer> sort = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int len = commands.length;

        // i번째부터 j번째까지 자르기
        for(int com = 0; com < len; com++){
            for(int i=commands[com][0]-1; i<commands[com][1]; i++){
                sort.add(arr[i]);
            }
            // 오름차순 정렬
            Collections.sort(sort);

            // k번째 값 추가
            result.add(sort.get(commands[com][2]-1));

            //배열 비워주기
            sort.clear();
        }

        System.out.println(result);
    }
    private void ex3(){
        // 배열 값 선언
        int[][] person = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] answers = {1, 2, 3, 4, 5};

        // 정답과 비교
        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                // 배열의 모든 값을 비교하기 위해 [j % person[i].length]를 한다
                if(person[i][j % person[i].length] == answers[j]){
                    hit[i]++;
                }
            }
            System.out.println(hit[i]);
        }
    }
}
