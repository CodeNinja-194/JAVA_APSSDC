class A{
void print(){
System.out.println("print A");}
}
class B {
Void print(){ 
System.out.println("print B");}
}
class C extends A,B{
public static void main(String[] args){
 C c=new C();
 c.print();
}
}