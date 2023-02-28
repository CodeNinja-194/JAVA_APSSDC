import java.io.*;
import java.util.*;
class Prime{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int i=2,count=0;
	while(i<n/2)
	{
	if(n%i==0)
	{
	count++;
	break;
    }
	i++;
	}
	if(count==0)
	System.out.println("the given number is a prime");
	else
	System.out.println("the given number is not a prime");
	}
	}
	