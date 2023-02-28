class K{
public static void main(String[] args){
try{
int A=10/0;
System.out.println("Value of A:"+A);
}
catch(ArithmeticException e)
{
System.out.println("Exception::::"+e);
}
try{
int a[]={33,4,5,6};
System.out.println("Arraydata::::"+a[6]);
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayException::::"+e);
}
catch(Exception e)
{
System.out.println("NormalException::::"+e);
}
}
}
