/*real time example on alarm*/
import java.util.Scanner;
class Breakdowhile
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("After how much time the alarm must ring(give sec value) : ");
  int sec=sc.nextInt();
  do{
	 if(sec==0)
	 {
	  System.out.println("Countdown : " + sec + " - .................ALARM.................");
	  break;
	 }
     System.out.println("Countdown : " + sec + " - No Alarm"); 
	 sec--;
    }while(sec>=0);
 }
}