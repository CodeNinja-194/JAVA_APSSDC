/WRITING A PROGRAM CONTAINING ABSTRACT METHOD AND NORMAL METHOD IN AN ABSTRACT CLASS/
abstract class A
{  
  abstract void a();  
  void b(){System.out.println(" --> NON ABSTRACT CLASS..!");}
}  
class B extends A
{  
 void a()
 {
 {
  System.out.print("ABSTRACT CLASS");
 }   
}  
class Abstraction
{
 public static void main(String args[])
 {  
  B obj = new B();    
  obj.a();
  obj.b();
 } 
}