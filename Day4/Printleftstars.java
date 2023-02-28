import java.io.*;
import java.util.*;
class Printleftstars
{ 
    public static void starPrint(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) 
		{
		for(j=2*(n-i); j>=0; j--) 
            {           
                System.out.print(" "); 
            } 
            for(j=0; j<=i; j++) 
            {       
                System.out.print("* "); 
            }           
            System.out.println(); 
        } 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
      System.out.println("enter n value to print no .of rows of stars");
       int n = sc.nextInt();  
        starPrint(n); 
    } 
}