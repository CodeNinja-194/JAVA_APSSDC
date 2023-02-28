import java.io.*;
import java.util.*;
class Sumofdigits{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int rem=0,sum=0;
	while(n!=0)
	{
	rem=n%10;
	sum=sum+rem;
	n=n/10;
	}
	System.out.println("sum of digits of a given number"+sum);
	}
	}
	