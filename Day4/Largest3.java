import java.io.*;
import java.util.Scanner;
class Largest3{
  public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
     System.out.println("enter num1 value");
   int num1 = sc.nextInt(); 
   System.out.println("enter num2 value");
   int num2 = sc.nextInt(); 
   System.out.println("enter num3 value");
   int num3 = sc.nextInt(); 
      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");
      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");
      else
          System.out.println(num3+" is the largest Number");
  }
}