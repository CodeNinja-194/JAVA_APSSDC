import java.io.*;
import java.util.*;
class Bcdowhile{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter 1 for break and 2 value for continue in do while");
   int n = sc.nextInt(); 
 switch (n) {
  case 1:int i=30;
     do
   {
      if (i == 34) {
        break;
      }
      System.out.println(i);
	  i++;
    }while(i<=40);  
    break;
  case 2:int i=30;
    do {
  if (i == 34) {
    continue;
  }
  System.out.println(i);
  i++;
 }while(i<=40);
    break;
}
}
}