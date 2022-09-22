import java.util.*;

public class GreenExam {
    public static void main(String[] args) {
        GreenExam greenExam = new GreenExam();
//        greenExam.ex1();
//        greenExam.ex2();
//        greenExam.ex3();
    }

    private void ex1(){
        int[] arr = {4, 7, 12};
        boolean[] check = {true, false, true};

        int result = 0;

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
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        ArrayList<Integer> sort = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int len = commands.length;


        for(int com = 0; com < len; com++){
            for(int i=commands[com][0]-1; i<commands[com][1]; i++){
                sort.add(arr[i]);
            }
            Collections.sort(sort);

            result.add(sort.get(commands[com][2]-1));
            sort.clear();
        }

        System.out.println(result);
    }
    private void ex3(){
        int[][] person = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] answers = {1, 2, 3, 4, 5};

        int[] hit = new int[3];
        for(int i = 0; i < hit.length; i++) {
            for(int j = 0; j < answers.length; j++) {
                if(person[i][j % person[i].length] == answers[j]){
                    hit[i]++;
                }
            }
            System.out.println(hit[i]);
        }
    }
}
