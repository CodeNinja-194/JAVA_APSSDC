import java.io.*;
import java.util.*;
class Queue {
    public static void main(String[] args) {
        // Creating an instance of PriorityQueue class
        PriorityQueue pq = new PriorityQueue();

       
        pq.add(4);
        pq.add(45);
        pq.add(76);
        pq.add(6);
        pq.add(5);
		pq.add(99);

        // Display Current list of the Queue
        System.out.println("Current Queue List:" + pq);
        System.out.println("The first element of the Queue :" + pq.poll());
		 System.out.println("New Queue List :" + pq.remove());
    }
}