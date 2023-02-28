import java.util.*; 
import java.util.stream.*; 
  
class GFG { 
  
    // Generic function to convert an Array to List 
    public static <T> List<T> convertArrayToList(T array[]) 
    { 
  
        // Create the List by passing the Array 
        // as parameter in the constructor 
        List<T> list = new ArrayList<>(); 
  
        // Add the array to list 
        Collections.addAll(list, array); 
  
        // Return the converted List 
        return list; 
    } 
  
    public static void main(String args[]) 
    { 
        // Create an Array 
        String array[] = { "Geeks", "forGeeks",  
                                    "A computer Portal" }; 
  
        // Print the Array 
        System.out.println("Array: " 
                              + Arrays.toString(array)); 
  
        // convert the Array to List 
        List<String> 
            list = convertArrayToList(array); 
  
        // Print the List 
        System.out.println("List: " + list); 
    } 
} 