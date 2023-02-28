import java.util.Scanner;
import java.io.*;
class Domain
{
	public static void main(String args[])
	{
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter ur email");
	 String str=sc.nextLine();
	 int len=str.length();
	 int num=str.indexOf('@');
	 str=str.substring(num+1,len);
	 System.out.println(str);
	}
}