import java.io.IOException;
class ThrowsExample{
void A() throws  IOException
{
throw new  IOException("Error");
}
void B() throws  IOException
{
A();

}
void C(){
	try{
		B();
	}
	catch(Exception e) {
	System.out.println("Exception is handled");
	}
}	
public static void main(String args[]){
	ThrowsExample obj=new ThrowsExample();
	obj.C();
	System.out.println("Execution over");
}
}