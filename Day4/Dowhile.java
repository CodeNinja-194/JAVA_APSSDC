import java.io.*;
import java.util.*;
class Dowhile{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
   System.out.println("enter i value");
	int i = sc.nextInt(); 
    do {
      System.out.println(i);
      i++;
    }
    while (i <=n);  
  }
}
