import java.util.*;
class MulTry
{
	public static void main(String Args[])
	{
		try
		{
			int[] a=new int[5];
			a[50]=95;
			System.out.println("value of a is:"+a);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception:"+e);
		}
		try
		{
			int i=925/0;
			System.out.println("value of i is:"+i);
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Exception:"+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception:"+e);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
		
	}
}