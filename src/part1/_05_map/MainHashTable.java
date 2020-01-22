package part1._05_map;

public class MainHashTable {
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6, "A"); // 1
        table.put(8, "B"); // 3
        table.put(11, "C"); // 1
        table.put(6, "A+"); // 1
        table.remove(6);
        System.out.println("Done");
        System.out.println(table.get(6));
    }
}
