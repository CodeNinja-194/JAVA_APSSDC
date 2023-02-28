import java.util.*; 
public class ArrayDequeClass
{ 
    public static void main(String[] args) 
    { 
        // Intializing an deque 
        Deque<Integer> d = new ArrayDeque<Integer>(10); 
  
        // add() method to insert 
        d.add(2); 
        d.add(4); 
        d.add(6); 
        d.add(8); 
        d.add(2); 
        for (Integer element : d) 
        { 
            System.out.println("Element : " + element); 
        } 
  
        System.out.println("Using clear() "); 
        //clear() method 
        d.clear(); 
  
        // addFirst() method to insert at start 
        d.addFirst(10); 
        d.addFirst(20); 
  
        // addLast() method to insert at end 
        d.addLast(24); 
        d.addLast(14); 
  
        System.out.println("Above elements are removed now \n"); 
  
        //size() of ArrayDeque 
        System.out.println("Size of deque : " + d.size() + "\n"); 
        for (Integer element : d) 
        { 
            System.out.println("Element : " + element); 
        } 
  
        // conatins() method 
        System.out.println("\nIs 10 +nt in deque : " + d.contains(10)); 
  
  
  
        // Iterator() : 
        System.out.println("\nElements of deque using Iterator :"); 
        for(Iterator itr = d.iterator(); itr.hasNext();) 
        { 
            System.out.println(itr.next()); 
        } 
  
  
        // descendingIterator() : to reverse the deque order 
        System.out.println("\nElements of deque in reverse order :"); 
        for(Iterator dItr = d.descendingIterator(); dItr.hasNext();) 
        { 
            System.out.println(dItr.next()); 
        } 
  
        // element() method : to get Head element 
        System.out.println("\nHead Element using element(): " + d.element()); 
  
        // getFirst() method : to get Head element 
        System.out.println("Head Element using getFirst(): " + d.getFirst()); 
  
        // getLast() method : to get last element 
        System.out.println("Last Element using getLast(): " + d.getLast()); 
  
  
        // isEmpty() method : 
        System.out.println("\nChecks whether deque is empty : " + d.isEmpty()); 
  
        //toArray() method : 
        Object[] arr = d.toArray(); 
        System.out.println("\nArray Size : " + arr.length); 
  
        System.out.print("Array elements : "); 
        for(int i=0; i<arr.length ; i++) 
            System.out.print(" " + arr[i]); 
    } 
} 