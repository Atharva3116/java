import java.util.HashSet;
public class ass1setb1
{
	public static void main(String[] args)
	{
		HashSet hs = new HashSet(5, 0.5f);
		System.out.println(hs.add("1"));
		System.out.println(hs.add("2"));
		System.out.println(hs.add("3"));
		System.out.println(hs.add("4"));
		System.out.println(hs.add("5"));
		System.out.println(hs);
		Boolean b = hs.add("1");
		System.out.println("Duplicate item allowed = " + b);
		System.out.println(hs);
	}
}
