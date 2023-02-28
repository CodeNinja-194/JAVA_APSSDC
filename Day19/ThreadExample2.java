class ThreadExample2 implements Runnable{
public void run()
{
System.out.println("thread is running");
}

public static void main(String args[])
{
	ThreadExample2 A=new ThreadExample2();
	A.run();
}
}