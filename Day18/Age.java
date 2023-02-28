class Age{

static void validate(int age){
  if (age<18)
  throw new ArithmeticException("not valid");
    else
   System.out.println("validated");  
}
public static void main(String[] args){
validate(10);
System.out.println("Method validated");		
}
}