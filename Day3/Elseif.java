import java.io.*;
import java.util.*;
public class Elseif {
public static void main(String[] args){
  Scanner sc=new Scanner(System.in); 
   System.out.println("enter value");
	int number = sc.nextInt(); 
        if (number > 0) {
            System.out.println("The number is positive.");
        }
        else if (number < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is 0.");
        } 
    }
}