class F{

public static void main(String[] args) {
  try{
  int A=30/0;
  System.out.println("the value of A iS::"+A);
  }
  catch(Exception e) {
  System.out.println("Exception is"+e);
  }
 finally{
	 System.out.println("Exception is handled");
 }
  }
  }