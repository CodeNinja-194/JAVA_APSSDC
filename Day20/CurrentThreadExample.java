class CurrentThreadExample extends Thread{
public void run(){
	System.out.println(Thread.currentThread().getName());
}


public static void main(String args[])
{
	CurrentThreadExample s=new CurrentThreadExample();
CurrentThreadExample s1=new CurrentThreadExample();
	s.start();   
	s1.start();
	
	
}





}