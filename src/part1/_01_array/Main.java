package part1._01_array;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.size();
        numbers.insert(40);
        numbers.size();
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(20));
        System.out.println(numbers.indexOf(50));
        numbers.print();
    }
}
