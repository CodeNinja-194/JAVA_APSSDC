class Abc
{
	public static void main(String Args[])
	{
		try
		{
			int i=92/0;
			System.out.println("value of i is:"+i);
		}
		catch(Exception e)
		{
			System.out.println("The output is:"+e);
		}
		
	}
}