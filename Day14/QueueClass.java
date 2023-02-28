import java.util.*;

class Queue {
    public static void main(String[] args) {
        // Creating an instance of PriorityQueue class
        PriorityQueue pq = new PriorityQueue();

        // By using add() method to add elements in the Queue
        pq.add(4);
        pq.add(45);
        pq.add(76);
        pq.add(6);
        pq.add(5);
		pq.add(99);

        // Display Current list of the Queue
        System.out.println("Current Queue List:" + pq);

        // By using poll() method of Queue will retrieve 
        // head element with removing head element of the Queue
        System.out.println("The first element of the Queue :" + pq.poll());

        // Display New Queue list of the Queue after implementing poll() method
        System.out.println("New Queue List :" + pq);
		 System.out.println("New Queue List :" + pq.remove());
    }
}