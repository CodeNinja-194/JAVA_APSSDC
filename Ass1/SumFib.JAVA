import java.util.*;
class SumFib{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
System.out.println(sumOfFibonacci(n));
}
 
public static int sumOfFibonacci(int n) {
int a = 0, b = 1, c = 0, d = 0;
for (int i = 3; i <= n; i++) {
c = a + b;
b = c;
a = b;
d = d + c;
}
return d;
}
}