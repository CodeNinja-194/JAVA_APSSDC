class ThreadExample1 extends Thread{

public void run(){
System.out.println("Thread is Running");;	
	
}
public static void main(String args[])
{
	ThreadExample1 a=new ThreadExample1();
	a.run();
}


}