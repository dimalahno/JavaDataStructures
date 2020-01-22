package part1._02_linked_list;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
//        System.out.println(list.size());
//        list.addFirst(5);
//        System.out.println(list.size());
//
//        list.removeFirst();
//        list.removeLast();
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        list.revers();
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.contains(5));
        System.out.println(list.getKthFromTheEnd(1));
    }
}
