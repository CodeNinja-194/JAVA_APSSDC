import java.io.*;
import java.util.*;
public class Nestedif {
public static void main(String[] args){
  Scanner sc=new Scanner(System.in); 
   System.out.println("enter value");
	int num = sc.nextInt(); 
	if( num < 100 )
	      { 
           System.out.println("number is less than 100");
          }
    else
         {	
           if(num > 100) 
		   {
	      System.out.println("number is greater than 100");
	       }
	     }
     }
}