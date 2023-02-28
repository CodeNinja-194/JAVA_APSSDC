import java.io.*;
import java.util.*;
class Bc{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter 1 for break and 2 value for continue");
   int n = sc.nextInt(); 
 switch (n) {
  case 1:
  for (int i = 0; i < 10; i++) {
      if (i == 4) {
        break;
      }
      System.out.println(i);
    }  
    break;
  case 2:
   for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
 }
    break;
}
}
}