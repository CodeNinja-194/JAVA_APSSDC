class Const {
   private int x;

   // constructor
   private Const(){
       System.out.println("Constructor Called");
       x = 5;
   }

   public static void main(String[] args){
       // constructor is called while creating object
       Const obj = new Const();
       System.out.println("Value of x = " + obj.x);
   }
}