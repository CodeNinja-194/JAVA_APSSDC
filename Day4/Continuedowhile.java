/*CHECKING WEATHER GIVING EVEN NUMBER IS PERFECT OR NOT*/
import java.util.Scanner;
class Continuedowhile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int n=0,sum=0;
  do
  {
   System.out.print("ENTER A EVEN NUMBER : ");
   n=sc.nextInt();
   if(n%2!=0)
   {
	continue;
   }
   for(int i = 1; i < n; i++)
   {
    if(n % i == 0)
    {
     sum = sum + i;
    }
   }
   if(sum == n)
    System.out.println("Given number is Perfect");
   else
    System.out.println("Given number is not Perfect");
  }while(n%2!=0);   	 
 }
}
