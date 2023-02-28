import java.io.*;
import java.lang.NumberFormatException;
class Number{
void A() throws NumberFormatException
{
throw new  NumberFormatException("Error");
}
public static void main(String args[]) throws NumberFormatException
{
	Null obj=new Null();
	obj.A();
}
}