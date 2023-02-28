class NamingThread extends Thread{

public void run(){
System.out.println("Thread is running");

}



public static void main(String args[]){

NamingThread s=new NamingThread();
System.out.println("Threadname"+s.getName());
s.setName("Java");
s.start();
System.out.println("Threadname"+s.getName());
}


}