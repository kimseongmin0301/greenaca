import java.io.*;
import java.util.ArrayList;

public class Back3040 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<>();

        int n = 0;

        for(int i=0; i<9; i++) {
            arr.add(Integer.parseInt(br.readLine()));

            n += arr.get(i);
        }
        n -= 100;

        for(int i=0; i<8; i++){
            for(int j=1; j<9; j++){
                if(arr.get(i) + arr.get(j) == n){
                    arr.remove(i);
                    arr.remove(j-1);
                    break;
                }
            }
            if(arr.size() == 7)
                break;
        }
        for(int i=0; i<7; i++) {
            System.out.println(arr.get(i));
        }
    }
}
