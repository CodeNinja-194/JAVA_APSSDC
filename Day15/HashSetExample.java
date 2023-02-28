import java.util.*;
class HashSetExample
{
	public static void main(String Argss[])
	{
		Set <String> s=new HashSet<>();
		s.add("Jg");
		s.add("Vj"); 
		s.add("Kt");
		s.add("Mt");
		s.add(" ");
		s.add("Lt");
		s.add("Vj");
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//System.out.println("Head Element:"+s);
		//s.pollLast();//removes the last element
		//System.out.println("Head Element:"+s);
	}
}