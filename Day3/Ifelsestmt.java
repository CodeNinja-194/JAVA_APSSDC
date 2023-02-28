import java.io.*;
import java.util.*;
public class Ifelsestmt {
public static void main(String[] args){
  Scanner sc=new Scanner(System.in); 
   System.out.println("enter value");
    int a=sc.nextInt();
	 if (a > 0) {
            System.out.println("The number is positive.");
        }
        else {
            System.out.println("The number is not positive.");
        }
 
        System.out.println("This statement is always executed.");
    }
}