import java.util.Scanner;

public class Back1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = String.valueOf(N);
        String[] arr = new String[2];
        int rn = 0;
        int cnt = 0;

        while(true) {

            for (int i = 0; i < 2; i++) {
                if(num.length() == 2) {
                    arr = num.split("");
                }else{
                    arr[0] = "0";
                    arr[1] = num;
                }
                rn += Integer.parseInt(arr[i]);
            }
            if(rn < 10)
                num = arr[1] + rn;
            else{
                num = arr[1] + rn%10;
            }

            rn = 0;
            cnt++;
            if(N == Integer.parseInt(num))
                break;
        }
        System.out.print(cnt);
    }
}

