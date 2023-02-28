class ConstvthNoarg{

   int i;

   // constructor with no parameter
   private ConstvthNoarg(){
       i = 5;
       System.out.println("Object created and i = " + i);
   }

   public static void main(String[] args) {

       // calling the constructor without any parameter
       ConstvthNoarg obj = new ConstvthNoarg();
   }
}