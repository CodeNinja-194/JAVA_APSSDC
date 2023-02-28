import java.io.*;
import java.util.*;
class Op
{
	public static void main(String[] args)
	{
   int x,a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter value");
	System.out.println("1.Addition,2.Subtraction,3.Multiplication,4.division,5.mod division,6.Invalid");
     x=sc.nextInt();
	 System.out.println("enter A value");
	  a=sc.nextInt();
	 System.out.println("enter B value");
	  b=sc.nextInt();
	switch(x)
	{
	case 1:c=a+b;
	System.out.print("sum of two numbers");
	System.out.print(c);
	break;
	case 2:c=a-b;
	System.out.print("sub of two numbers");
	System.out.print(c);
	break;
	case 3:c=a*b;
	System.out.print("mul of two numbers");
	System.out.print(c);
	break;
	case 4:c=a/b;
	System.out.print("division of two numbers");
	System.out.print(c);
	break;
	case 5:c=a%b;
	System.out.print("modulo-division of two numbers");
	System.out.print(c);
	break;
	default:
	System.out.println("Invalid");
	}
}
}