import java.io.*;
import java.util.*;
class GCD {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
     System.out.println("enter num1 value");
   int num1 = sc.nextInt(); 
   System.out.println("enter num1 value");
        int num2 =sc.nextInt();
        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
        System.out.printf("GCD of given numbers is: %d", num2);
    }

}