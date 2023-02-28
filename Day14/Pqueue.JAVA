import java.util.*;
public class Pqueue
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
		
		
	System.out.println("Size Of Queue  : " + pq.size());	          //Displays the queue size
		
	
	System.out.print("Enter No.Of Elements You Want To Remove   : "); // remove elements from queue
	int a=sc.nextInt();
	for(int i=0;i<a;i++)       
	{
	 pq.remove();
	}
	
	
	System.out.println("Created Queue  : " + pq); 	                  //Displays the queue elements
	
	
	System.out.print("Enter No.Of Elements You Want To Remove   : "); // remove elements from queue
	int rem=sc.nextInt();
	for(int i=0;i<rem;i++)       
	{
	 pq.poll();
	}
	
	
	System.out.println("Created Queue  : " + pq); 	                  //Displays the queue elements
	
	
	System.out.print("Enter Data To Be Searched  : "); 	      //Searches Element int th  queue
	System.out.println("Searched Element           : " + pq.contains(sc.next())); 	      //Displays the queue elements
	
	
	pq.clear();
	System.out.println("Created Queue After Clear(): " + pq); 	     //Displays the queue elements after clear method
	
 }
}