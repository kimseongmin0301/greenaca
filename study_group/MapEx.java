import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        String[] a = {"A","B","C","A","B","B","A","A","C","B","A"};

        for(String i : a){
            map.put(i, map.getOrDefault(i , 0)+1);
        }

        System.out.print(map);
    }
}
