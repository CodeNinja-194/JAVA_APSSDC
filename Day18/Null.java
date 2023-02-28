import java.io.*;
import java.lang.NullPointerException;
class Null{
void A() throws  NullPointerException
{
	try{
	String str=null;
        System.out.println(str.length());
}
catch(Exception e)
{
	System.out.println(e);
}
throw new  NullPointerException("Error");
}
public static void main(String args[]) throws NullPointerException
{
	Null obj=new Null();
	obj.A();
}
}