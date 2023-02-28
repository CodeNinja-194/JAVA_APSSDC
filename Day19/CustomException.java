import java .io.*;
class CustomException 
{
void B() throws NullPointerException
{
   try{
		String str=null;
		System.out.println (str.length());
	}
        catch(Exception e){
		System.out.println("NullPointerException.."+e);
	}
throw new NullPointerException("Error");
}
public static void main(String args[])throws IOException,NullPointerException
{
	
	CustomException obj = new CustomException();
	obj.B();
	System.out.println("Execution over");
}

}
