import java.io.*;
import java.util.*;
class Odds{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("enter n value");
   int n = sc.nextInt(); 
    int i=1,sum=0;
	while(i<=n)
	{
	if(i%2!=0)
	{
	sum=sum+i;
    }
	i++;
	}
	System.out.println("the sum of Odd numbers upto given number "+sum);
	}
	}
	