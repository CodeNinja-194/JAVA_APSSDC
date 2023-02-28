import java.io.*;
import java.util.Scanner;
public class SumOfTime {


public static void main(String[] args) {

// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s1=sc.nextLine();
String s2=sc.nextLine();
//addTime("10.10","20.30");
SumOfTime s3=new SumOfTime();
s3.addTime(s1,s2);

}

public static void addTime(String a, String b)

{

int minSum = 0;

int hourSum = 0;

int hour1= Integer.parseInt(a.substring(0,2));

int hour2= Integer.parseInt(b.substring(0,2));

int min1= Integer.parseInt(a.substring(3,5));

int min2= Integer.parseInt(b.substring(3,5));

minSum = min1 + min2;

if(minSum>59)

{

hourSum+=1;

minSum%=60;

}

hourSum = hourSum + hour1 + hour2;

System.out.println(hourSum+" "+minSum);

}

}