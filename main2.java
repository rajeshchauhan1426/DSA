import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Collection;

public class main2 {

    public static void main(String args[]){
        // Queue <Double> queue = new PriorityQueue<>();
        Queue <String> queue = new PriorityQueue<>();


        // queue.offer(1.2);
        // queue.offer(1.5);
        // queue.offer(1.1);

        queue.offer("A");
        queue.offer("d");
        queue.offer("c");
        queue.offer("s");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
            
        }
    }
}