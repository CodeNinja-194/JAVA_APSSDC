import java.io.*;
import java.util.*;
public class Elseifmarks{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in); 
   System.out.println("enter marks");
	int marks = sc.nextInt(); 
         if((marks>=80)&&(marks<=100))		   
		        System.out.println("Distinction");
		    else if ((marks>=60)&&(marks<=79))
		        System.out.println("First class");
		     else if ((marks>=40)&&(marks<=59))
		 	    System.out.println("Second class");
		   else if ((marks>=0)&&(marks<=100))
		        System.out.println("Fail");
		else
			System.out.println("marks out of range");
	}
}