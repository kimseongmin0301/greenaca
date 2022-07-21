import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;

public class Back5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> stu = new HashSet<>();

        for(int i=0; i<28; i++)
            stu.add(Integer.parseInt(br.readLine()));

        for(int i=1; i<=30; i++){
            if(stu.contains(i) == false)
                System.out.println(i);
        }
    }
}
