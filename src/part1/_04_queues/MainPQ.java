package part1._04_queues;

public class MainPQ {
    public static void main(String[] args) {
//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(5);
//        queue.add(1);
//        queue.add(3);
//        queue.add(2);
//        System.out.println(queue.toString());

        PriorityQueue pq = new PriorityQueue();
        pq.add(5);
        pq.add(3);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}
