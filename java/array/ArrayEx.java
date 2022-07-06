package array;

import java.util.*;

public class ArrayEx {
    public static void main(String[] args) {
        int [] result = {79,88,91,33,100,55,95,60,72,57};
        int sum = 0;
        Arrays.sort(result);

        for(int i=0; i<result.length; i++) {
            sum += result[i];
        }

        int max = 0;
        int min = 0;
        float avg = sum / (float)result.length;

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("최댓값 : " + result[result.length-1]);
        System.out.println("최솟값 : " + result[0]);

//        Scanner sc = new Scanner(System.in);
//        int[] result = new int[10];
//        int sum = 0;
//        for(int i=0; i<result.length; i++){
//            result[i] = sc.nextInt();
//            sum += result[i];
//        }
//        Arrays.sort(result);
//        float avg = sum/result.length;
//        System.out.println("총점 : " + sum);
//        System.out.println("평균 : " + avg);
//        System.out.println("최댓값 : " + result[result.length-1]);
//        System.out.println("최솟값 : " + result[0]);

    }
}
