import java.io.*;
import java.util.*;
class Power {
    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
     System.out.println("enter number value");
   int number = sc.nextInt(); 
   System.out.println("enter power value");
        int p =sc.nextInt();
        long result = 1;
        int i=p;
        while (i != 0)
        {
            result *= number;
            --i;
        }
        System.out.println(number+"^"+p+" = "+result);
    }
}