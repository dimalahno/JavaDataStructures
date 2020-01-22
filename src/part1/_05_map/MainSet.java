package part1._05_map;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 3, 5, 3, 5, 2, 7, 8};
        for(var number : numbers)
            set.add(number);

        System.out.println(set);

        CharFinder cf = new CharFinder();
        var ch = cf.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
