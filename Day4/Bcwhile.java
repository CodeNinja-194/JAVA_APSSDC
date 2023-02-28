import java.io.*;
import java.util.*;
class Bcwhile{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter 1 for break and 2 value for continue in while");
   int n = sc.nextInt(); 
 switch (n) {
  case 1:int i=10;
     while(i<=20)
   {
      if (i == 14) {
        break;
      }
      System.out.println(i);
	  i++;
    }  
    break;
  case 2:int i=10;
    while(i<=20) {
  if (i == 14) {
    continue;
  }
  System.out.println(i);
  i++;
 }
    break;
}
}
}