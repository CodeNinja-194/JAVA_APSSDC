import java.io.IOException;
class ThrowsExample1{
void A() throws  IOException{
System.out.println("no error");
}
public static void main(String args[]) throws IOException
{
	ThrowsExample1 obj=new ThrowsExample1();
	obj.A();
System.out.println("Working");
}
}