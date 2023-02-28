import java.io.*; 
  
public class Test { 
    public static void main(String[] args) { 
        System.out.println("Hi (from main)"); 
        Test.main("hi"); 
    } 
    public static void main(String arg1) { 
        System.out.println("Hi, " + arg1); 
        Test.main("Dear ","My "); 
    } 
    public static void main(String arg1, String arg2) { 
        System.out.println("Hi, " + arg1 + ", " + arg2); 
    } 
} 