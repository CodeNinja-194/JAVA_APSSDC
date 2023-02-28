import java.io.*;
import java.util.*;
class Armstrong{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int rem=0,rev=0,temp=n;
	while(n!=0)
	{
	rem=n%10;
	rev=rev+(rem*rem*rem);
	n=n/10;
	}
	if(temp==rev)
	System.out.println("given number is a Armstrong"+rev);
	else
	System.out.println("given number is not a Armstrong"+temp);
	}
	}
	