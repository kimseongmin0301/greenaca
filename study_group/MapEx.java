import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] a = {"A","B","C","A","B","B","A","A","C","B","A"};

        for(String i : a){
            map.put(i, map.getOrDefault(i , 0)+1);
            //map에 값이 없었다면 value = 1, 있었다면 value += 1
        }

        System.out.println(map);
        //{A=5, B=4, C=2}
    }
}
