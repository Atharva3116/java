import java.util.*;
public class ass1seta2
{
	public static void main(String[] args)
	{
		LinkedList<String>a1=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		System.out.println("\nEnter Names:");
		for(int i=0;i<n;i++)
		{
			a1.add(sc.next());
		}
		System.out.println("\nName of Friends are:");
		Iterator<String>itr=a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
