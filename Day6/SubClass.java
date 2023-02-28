class SuperClass1{
   public void demo() {
      System.out.println("demo method");
   }
}
class SuperClass2{
   public void demo() {
      System.out.println("demo method");
   }
}
class SubClass extends SuperClass1, SuperClass2 {
   public static void main(String args[]) {
      SubClass obj = new SubClass();
      obj.demo();
   }
}