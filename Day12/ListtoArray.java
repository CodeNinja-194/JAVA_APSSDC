import java.io.*; 
import java.util.List; 
import java.util.LinkedList; 
  
class ListtoArray
{ 
    public static void main (String[] args) 
    { 
        List<String> list = new LinkedList<String>(); 
        list.add("Java"); 
        list.add("Programming"); 
        list.add("language"); 
        list.add("Practice"); 
  
        String[] arr = new String[list.size()]; 
  
        // ArrayList to Array Conversion 
        for (int i =0; i < list.size(); i++) 
            arr[i] = list.get(i); 
  
        for (String x : arr) 
            System.out.print(x + " "); 
    } 
} 