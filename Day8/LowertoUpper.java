class LowertoUpper{
  public static void main(String[] args) {
    String example = new String("Hello! World");

    System.out.println("Using the subString(): " + example.substring(7));
	
    System.out.println("Using the toLowerCase(): " + example.toLowerCase());


    System.out.println("Using the toUpperCase(): " + example.toUpperCase());

   
    System.out.println("Using the replace(): " + example.replace('!', 'o'));
  }
}