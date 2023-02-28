import java.util.*;
class MulCatch
{
	public static void main(String Args[])
	{
		try
		{
			int i=100/0;
			System.out.println("value of i is:"+i);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Exception:"+e);
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