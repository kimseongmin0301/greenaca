package loop;

public class While {
    public static void main(String[] args) {

        //while
        int sum = 0, i = 1;
        while(sum < 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //do-while
        int sum2 = 200, j = 1;
        do{
            System.out.println(sum2);
            sum2 += i;
            j++;
        }
        while(sum < 100);
    }
}
