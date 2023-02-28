/*real time example on money withdrawl*/
import java.util.Scanner;
class Continuefor
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("How much amount do you want(Enter multiples of 100) : ");
  int amount=sc.nextInt(),intrest=0;
  for(int i=100;amount%100==0 && i<=amount;i+=100)
  {
    if(i%1000==0 && i>=1000)
	{
	 intrest-=10;
	 System.out.println("..............Giving amount 100/- - 100/- intrest(" + (i+intrest) + ")..............");    
	 continue;
	}
     System.out.println("..............Giving amount 100/-                (" + (i+intrest) + ")..............");   	
  } 
  System.out.println("...................................Transaction..Ended.....................................");
 }
}