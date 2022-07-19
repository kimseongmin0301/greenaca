import java.util.Scanner;

public class Back25372 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String result = sc.next();
            System.out.println(result.length() < 10 && result.length() > 5 ? "yes" : "no");
        }
    }
}