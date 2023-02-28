class ThreadI implements Runnable{

public void run(){
System.out.println("Thread is Running");;	
	
}
public static void main(String args[])
{
	ThreadI a=new ThreadI();
	Thread t=new Thread(a);
	t.start();
}


}