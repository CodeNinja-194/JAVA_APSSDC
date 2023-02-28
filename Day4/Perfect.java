import java.io.*;
import java.util.*;
class Perfect{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int i=1,sum=0;
	while(i<n)
	{
	if(n%i==0)
	{
	sum=sum+i;
    }
	i++;
	}
	if(n==sum)
	System.out.println("the given number is a perfect");
	else
	System.out.println("the given number is not a perfect");
	}
	}
	