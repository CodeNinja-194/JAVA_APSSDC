import java.util.*;
public class Pqueue1
{
 public static void main(String[] args) 
 {
	Scanner sc=new Scanner(System.in);                                // Create an object for scanner class
	

    PriorityQueue<String> pq = new PriorityQueue<String>();           // Create a priority queue
 
   
    System.out.print("Enter No.Of Elements You Want To Insert   : "); // Add elements to priority queue
	int size=sc.nextInt();
	for(int i=0;i<size;i++)       
	{
	 System.out.print("Enter Element " + (i+1) + " Data : ");
	 pq.offer(sc.next());
	}
 
    
	System.out.println("Created Queue  : " + pq);                     //Displays the queue elements
	
	
    System.out.println("Queue Head     : " + pq.peek());              //Displays first element in queue
	System.out.println("Queue Head     : " + pq.element()); 
		
		
	System.out.println("Size Of Queue  : " + pq.size());	        
		
	System.out.println(" removed element  : " + pq.remove()); 	               
	System.out.println("Queue  : " + pq.poll()); 	                
	
	
	
	
 }
}