import java.io.*;
import java.lang.NullPointerException;
class MultipleException{
void A() throws  NullPointerException,ArithmeticException
{
	try{
	String str=null;
        System.out.println(str.length());
       int  i=10/0;
		}
catch(ArithmeticException e)
{
	System.out.println("divide by zero not possible");
	throw new  ArithmeticException("Error");
}

catch(NullPointerException ne){
	System.out.println("null pointer exception");
	throw new  NullPointerException("Error");
}
}
public static void main(String args[]) 
{
	MultipleException obj=new MultipleException();
	obj.A();
}
}