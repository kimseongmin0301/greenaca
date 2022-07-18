package DynamicArrays;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Hashmap> map = new HashMap<>();
        Hashmap hm = new Hashmap();

        hm.name="가나다";
        hm.sum=1;
        map.put(1,hm);
        hm = new Hashmap();

        hm.name="aaa";
        hm.sum=2;
        map.put(2,hm);

        System.out.println(map);

        System.out.println(map.get(1).name);
        System.out.println(map.get(1).sum);

        System.out.println(map.get(2).name);
        System.out.println(map.get(2).sum);
    }

    private String name;
    private int sum;
}
