import java.util.*;
class Tryemp{
public static void main(String ae[]){
try{
try{
int ar[]=new int[2];
ar[0]=1;
ar[1]=2;
ar[2]=4;
ar[3]=5;
int i=10/0;
}
catch(ArithmeticException a)
{
	System.out.println("the error is divide by zero..");
}
}

catch(Exception e){
System.out.println("the error is..."+e);
}
}
}