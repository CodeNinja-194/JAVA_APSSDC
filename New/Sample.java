import java.util.Arrays;
import java.util.Scanner;

class Sample 
{
 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  Hostel[] h = new Hostel[4];
  for (int i = 0; i < 4; i++) {
   int a = sc.nextInt();
   sc.nextLine();
   String b = sc.nextLine();
   int c = sc.nextInt();
   sc.nextLine();
   double d = sc.nextDouble();
   sc.nextLine();
   h[i] = new Hostel(a, b, c, d);
  }
  String in1 = sc.nextLine();
  double in2 = sc.nextDouble();
  int a1 = searchHostelByName(h, in1);
  if (a1 == 0) 
  {
   System.out.println("There is no such Hostel available.");
  }
   else 
   {
   System.out.println(a1);
  }
  Hostel[] a2 = sortHostelByfee(h, in2);
  if (a2 == null)
   {
   System.out.println("No Hostel found.");
  } 
  else 
  {
   for (int i = 0; i < a2.length; i++) 
   {
    System.out.println(a2[i].getHostelName());
   }
  }
 }
 public static int searchHostelByName(Hostel[] h, String input1) 
 {
  for (int i = 0; i < h.length; i++)
   {
   if (h[i].getHostelName().equalsIgnoreCase(input1)) 
   {
    return h[i].getVacancies();
   }
  }
  return 0;
 }
 public static Hostel[] sortHostelByfee(Hostel[] h, double input2) {
  Hostel[] arr = new Hostel[0];
  for (int i = 0; i < h.length; i++) {
   if (h[i].getFee() < input2) {
    arr = Arrays.copyOf(arr, arr.length + 1);
    arr[arr.length - 1] = h[i];

   }

  }

  for (int i = 0; i < arr.length - 1; i++) {
   for (int j = 0; j < arr.length - i - 1; j++) {
    if (arr[j].getFee() > arr[j + 1].getFee()) {

     Hostel temp = arr[i];
     arr[i] = arr[i + 1];
     arr[i + 1] = temp;
    }

   }
   if (arr.length > 0) {
    return arr;

   }
  }
  return null;

 }

}

class Hostel {

 private int hostelId;
 private String hostelName;
 private int vacancies;
 private double fee;

 public Hostel(int hostelId, String hostelName, int vacancies, double fee) {

  this.hostelId = hostelId;
  this.hostelName = hostelName;
  this.vacancies = vacancies;
  this.fee = fee;
 }

 public int getHostelId() {
  return hostelId;
 }

 public String getHostelName() {
  return hostelName;
 }

 public int getVacancies() {
  return vacancies;
 }

 public double getFee() {
  return fee;
 }

}