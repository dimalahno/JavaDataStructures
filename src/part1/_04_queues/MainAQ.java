package part1._04_queues;

public class MainAQ {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.enqueue(40);
        var item = arrayQueue.dequeue();
        System.out.println(item);
        arrayQueue.enqueue(50);
        arrayQueue.enqueue(60);
        System.out.println(arrayQueue.toString());
    }
}
