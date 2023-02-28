import java.util.*;
class DQueueExample
{
	public static void main(String Argss[])
	{
		Deque <String> li=new LinkedList<>();
		li.add("Jg");
		li.add("Vj");
		li.add("Kt");
		li.add("Mt");
		li.add("Lt");
		System.out.println("Head Element:"+li);
		li.poll();
		System.out.println("Head Element:"+li);
		li.remove();
		System.out.println("Head Element:"+li);
		li.offer("Jg");//offer is used to add Elements in last position
		System.out.println("Head Element:"+li);
	}
}