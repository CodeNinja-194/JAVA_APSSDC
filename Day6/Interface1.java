interface MyInterface
{
   public void method1();
   public void method2();
}
class Interface1 implements MyInterface
{
   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new Interface1();
	obj.method1();
   MyInterface obj1 = new Interface1();
	obj1.method2();
   }
}