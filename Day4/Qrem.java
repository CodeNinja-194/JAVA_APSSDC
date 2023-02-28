import java.io.*;
import java.util.*;
class Qrem {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     System.out.println("enter num1 value");
        int num1=sc.nextInt();
		System.out.println("enter num1 value");
		int num2=sc.nextInt();
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        System.out.println("Quotient is: " + quotient);
        System.out.println("Remainder is: " + remainder);
    }
}