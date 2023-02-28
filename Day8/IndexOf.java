class IndexOf {
 
    public static void main(String[] args) {
         
        String str = "Saurav " + "is my elder brother";
        System.out.println(str);
        System.out.println("index of 'u' is " + str.indexOf('p'));
        System.out.println("index of 'v' is " + str.indexOf('u'));
        System.out.println("last index of 'b' is " + str.lastIndexOf('S'));
        System.out.println("last index of 'r' is " + str.lastIndexOf('s'));
    }
 
}