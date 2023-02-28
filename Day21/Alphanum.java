import java.io.*;
import java.util.*;
class Alphanum
{
	static void removeSpecialCharacter(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'A'|| s.charAt(i)>'Z'&& s.charAt(i)<'a'|| s.charAt(i)>'z')
			{
				s=s.substring(0,i)+s.substring(i+1);
				i--;
			}
		}
		System.out.println(s.toUpperCase());
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter ur String");
	    String str=sc.nextLine();
		removeSpecialCharacter(str);
	}
}
		
     