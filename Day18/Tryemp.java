import java.util.*;
class Tryemp{
void A() throws NumberFormatException
{
try{
String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
}
catch(ArithmeticException a)
{
	System.out.println("the error is divide by zero..");
}


catch(Exception e){
System.out.println("the error is..."+e);
throw new  NumberFormatException("Error");
}
}
public static void main(String ar[])
{
	Tryemp a=new Tryemp();
	a.A();
}
}