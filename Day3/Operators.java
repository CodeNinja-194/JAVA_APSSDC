import java.util.Scanner;
import java.io.*;
class Operators{
    public static void main(String[] args)
     {
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter data to sum it");
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
        System.out.println("1.add\n 2.sub\3.mul\n4.div");
        int d=sc.nextInt();
        switch(d){
            case 1:System.out.println("The addition of three numbers"+(a+b+c));
                        break;
            case 2:System.out.println("The subtraction of three numbers"+(a-b-c));
                        break;
            case 3:System.out.println("The multiplication of numbers"+(a*b*c));
                        break;
            case 4:System.out.println("The division of three numbers"+((a/b)/c));
                        break;
            default:System.out.println("U have chone none operation");
        }

    }
}