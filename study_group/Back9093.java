import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Back9093 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String result = "";
            Stack<Character> st = new Stack<>();
            String str = br.readLine() + " ";
            for(char c : str.toCharArray()){
                st.push(c);
                if(c == ' '){
                    int size = st.size();
                    for(int i=0; i<size; i++){
                        st.pop();
                        if(!st.empty()){
                            result += st.peek();
                        }
                    }
                    st.clear();
                    result += " ";
                }
            }
            System.out.println(result);
        }
    }
}
