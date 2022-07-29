import java.io.*;
import java.util.Stack;

public class Back9012 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++) {
            sb.append(stack(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
    static String stack(String s){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                st.push(c);
            }else if(st.empty()){
                return "NO";
            }else{
                st.pop();
            }
        }
        if(st.empty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
