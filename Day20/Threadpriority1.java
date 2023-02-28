class A extends Thread  //extends thread class
{
public void run()
{
int i=30,j=50;
System.out.println("addition of two numbers..."+(i+j)+" "+currentThread().getName()+"  priority--> "+currentThread().getPriority());
}
}
class B extends Thread{
	public void run(){
		int a=25,b=20;
	System.out.println("multiplication of two numbers..."+(a*b)+" "+currentThread().getName()+"  priority-->  "+currentThread().getPriority());}
}
class C extends Thread{
	public void run(){
		int p=2456,q=2;
	System.out.println("division of two numbers..."+(p/q)+" "+currentThread().getName()+"  priority-->  "+currentThread().getPriority());}
	

}

class Threadpriority1{
public static void main(String args[]){
A obj=new A();
B obj1=new B();
C obj2=new C();
obj.start();
obj1.start();
obj2.start();
obj.setName("two");
obj.setPriority(1);//min_priority
obj1.setName("one");
obj1.setPriority(5);//Norm_priority
obj2.setName("three");
obj2.setPriority(10);//max_priority
}
}