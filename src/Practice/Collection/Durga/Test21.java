package Practice.Collection.Durga;

import java.util.PriorityQueue;
import java.util.Queue;

public class Test21
{
    public static void main(String[] args) {

        Queue q1 = new PriorityQueue();

        System.out.println("q1.peek() = " + q1.peek());
       // System.out.println("q1.element() = " + q1.element());

        for(int i=0; i<10; i++)
        {
            q1.offer(i);
        }

        System.out.println("Priority-Queue (q1) = " + q1);

        System.out.println("Removing First-element (FIFO) = " + q1.poll());

        q1.offer(2);
        System.out.println("Priority-Queue (q1) = " + q1);
    }
}
