import java.io.*;
import java.util.*;
public class Whileloop {
public static void main(String[] args){
  Scanner sc=new Scanner(System.in); 
   System.out.println("enter value");
	int i = sc.nextInt(); 
	while (i < 10)//enter value below 10
	{
      System.out.println(i);
      i++;
    }  
  }
}
