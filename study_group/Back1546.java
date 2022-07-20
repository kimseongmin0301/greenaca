import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Back1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int su = Integer.parseInt(st.nextToken());

        double[] jum = new double[su];
        double max = 0;
        double result = 0;

        for (int i = 0; i < su; i++) {
            int num = Integer.parseInt(br.readLine());
            jum[i] = num;
            max = jum[i];

            if (max < jum[i]) {
                max = jum[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < su; i++) {
            result += jum[i] / max * 100;
        }

        bw.write(String.valueOf(result /= su));
        bw.flush();
        bw.close();

    }
}
