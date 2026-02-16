import java.util.Queue;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Queue is a data structure that follows the First In First Out (FIFO) principle. 
        // Stores objects in a horizontal manner 
        // It follows enqueuing and dequeuing operations, where elements are added at the rear of the queue and removed from the front of the queue.
        // enqueue = add - offer();
        // dequeue = remove - poll();
        // It has two main operations: offer (to add an element to the end of the queue) 
        // and poll (to remove the front element from the queue)

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Henry");
        queue.offer("Hugh");
        queue.offer("Robert");
        queue.offer("Chris");

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains("Henry"));

        // queue.poll();

        System.out.println(queue.peek());
        System.out.println(queue);

    }
}