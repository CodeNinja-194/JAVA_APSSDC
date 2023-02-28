import java.io.*;
import java.util.*;
class Factorial{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int i=1,fact=1;
	while(i<=n)
	{
	fact=fact*i;
	i++;
	}
	System.out.println("the factorial of a given number "+fact);
	}
	}
	
	