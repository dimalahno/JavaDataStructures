package part1._05_map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
/*        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jon");
        map.put(2, "Mary");
        map.put(3, "Den");
        map.put(null, null);
        map.remove(null);
        System.out.println(map);

        for (var item: map.keySet()){
            System.out.println(item);
        }

        for (var item: map.entrySet()){
            System.out.println(item);
        }*/

        /*
        CharFinder cf = new CharFinder();
        String str = "a green apple";
        var ch = cf.findFirstNonRepeatingChar(str);
        System.out.println(ch);
        */

        Map<String, String> map = new HashMap<>();
//        map.put(123456, "Jon");
        map.put("123456-A", "Jon");
        System.out.println(hash("123456-A"));
    }

    /*public static int hash (int key){
        return key % 100;
    }*/

    public static int hash (String key){
        int hash = 0;
        for (var ch : key.toCharArray())
            hash += ch;
        return hash % 100;
    }
}
