import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        // Priority Queue = FIFO Data Structure that serves elements
        // with the highest priorities first
        // before elements with lower priority

        PriorityQueue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(1.0);
        queue.offer(2.0);
        queue.offer(5.0);
        queue.offer(4.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
