import java.util.Scanner;
class Compare1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.print("ENTER YOUR NAME   :");
  String s1=sc.nextLine();
  System.out.print("ENTER YOUR GENDER :");
  String s2=sc.nextLine();
  System.out.print("ENTER YOUR AGE    :");
  String s3=sc.nextLine();
  
  
  System.out.print(s1 + " is a");
  
  
  if(s2=="female")
   System.out.print(" Female");
  else
   System.out.print(" Male");
   
   
  if(s3.equals("18") || s3.compareTo("18")>0)
   System.out.print(" Major...!");
  else
   System.out.print(" Minor...!");  
 }
}