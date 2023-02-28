interface Inf1{
   public void method1();
}
interface Inf2 extends Inf1 {
   public void method2();
}
public class InterfaceInherit implements Inf2{
    public void method1(){
	System.out.println("method1");
    }
    public void method2(){
	System.out.println("method2");
    }
    public static void main(String args[]){
	Inf2 obj = new InterfaceInherit();
	obj.method2();
	Inf2 obj2 = new InterfaceInherit();
	obj2.method1();
    }
}