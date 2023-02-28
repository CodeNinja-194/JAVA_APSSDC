import java.util.*;
class ArrayDequeExample
{
	public static void main(String Argss[])
	{
		Deque <String> li=new ArrayDeque<>();
		li.add("Jg");
		li.add("Vj");
		li.add("Kt");
		li.add("Mt");
		System.out.println("Head Element:"+li);
		li.offerFirst("Lt");
		System.out.println("Head Element:"+li);
		li.pollLast();//removes the last element
		System.out.println("Head Element:"+li);
	}
}