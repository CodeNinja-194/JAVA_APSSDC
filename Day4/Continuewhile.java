/*x^x OF AN ODD NATURAL NUMBER USING WHILE*/
import java.util.Scanner;
class Continuewhile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int num=0,i,n=1;
  while(num%2==0)
  {
   System.out.print("ENTER AN ODD NATURAL NUMBER : ");
   num=sc.nextInt();
   if(num%2==0)
   {
	continue;
   }
   for(i=0;i<num;i++){n*=num;}
   System.out.println(num + "^" + num + " : " + n);	 
  }
 }
}
