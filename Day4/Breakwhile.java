/*student's behaviour till exam */
import java.util.Scanner;
class Breakwhile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("How many days do you have for exam : ");
  int day=sc.nextInt();
  while(day>0)
  {
   if(day==1)
   {
    System.out.println("day-1 : Tommorow is exam...time for studying ...! ");
	break;
   }
   System.out.println("day-" + day + " : No study...still I have time...! ");	
   day--;   
  }
  System.out.println("day-0 (Today is exam) : Haha...Better luck next time...! ");
 }
}
