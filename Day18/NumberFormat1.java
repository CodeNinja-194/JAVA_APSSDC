import java.util.*;
class NumberFormat1{
void A() throws NumberFormatException
{
try{
try{
String s="abc";  
int i=Integer.parseInt(s);//NumberFormatException  
}
catch(ArithmeticException a)
{
	System.out.println("the error is divide by zero..");
}
}

catch(Exception e){
System.out.println("the error is..."+e);
throw new  NumberFormatException("Error");
}
}
public static void main(String ar[])
{
	NumberFormat1 a=new NumberFormat1();
	a.A();
}
}