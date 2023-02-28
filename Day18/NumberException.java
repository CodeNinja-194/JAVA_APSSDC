import java.io.*;
import java.lang.NumberFormatException;
class NumberException
{
   public static void main(String args[])
   {
      try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }
	   catch(Exception e)
   }
}