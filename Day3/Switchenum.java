import java.io.*;
class Switchenum{  
enum Day{ SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}  
public static void main(String args[]){  
Day day=Day.THURSDAY;  
  
switch(day){  
case SUNDAY:   
 System.out.println("sunday");  
 break;  
case MONDAY:   
 System.out.println("monday");
 break; 
 case TUESDAY:   
 System.out.println("Tuesday");  
 break;
case WEDNESDAY:   
 System.out.println("Wednesday");  
 break;
case THURSDAY:   
 System.out.println("Thursday");  
 break;
case FRIDAY:   
 System.out.println("Friday");  
 break;
case SATURDAY:   
 System.out.println("Saturday");  
 break; 
default:  
System.out.println("other day");  
}  
}
}  