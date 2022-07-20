import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Back1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int su = Integer.parseInt(br.readLine());

        String[] jum = br.readLine().split(" ");
        double max = 0;
        double result = 0;

        for (int i = 0; i < su; i++) {
            if (max < Integer.parseInt(jum[i])) {
                max = Integer.parseInt(jum[i]);
            }
        }

        for (int i = 0; i < su; i++) {
            result += Integer.parseInt(jum[i]) / max * 100;
        }
        result /= su;
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
