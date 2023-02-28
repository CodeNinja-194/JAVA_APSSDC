class vv
{
 static void vla(String n,int...a)
 {
  System.out.println(n);
  for(int i:a)
  {
   System.out.println(i);
  }
 }
 public static void main(String args[])
 {
  vla("hello");
  vla("hii friends",10);
  vla("hee",10,20,30);
 }
}