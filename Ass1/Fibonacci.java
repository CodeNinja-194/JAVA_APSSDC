import java.util.*;
class Fibonacci{
public static void main(String[] args) throws Exception {
Scanner input=new Scanner(System.in);
System.out.print("Enter value of n: ");
int sum=0;
    int num = input.nextInt();
    int f1=0,f2=0,f3=1;
    for(int i=1;i<=num;i++){
        System.out.println(f3);
        sum+=f3;
        f1=f2;
        f2=f3;
        f3=f1+f2;
    }
    System.out.println("Sum of Fibonacci Series: "+sum);
}
}