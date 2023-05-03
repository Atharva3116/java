import java.util.*;
class ass1seta1
{
	public static void main(String[] args)
	{
		ArrayList A1=new ArrayList();
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n:");
		n=sc.nextInt();
		System.out.println("\nEnter Name of Cities:");
		for(int i=0;i<n;i++)
		{
			A1.add(sc.next());
		}
		System.out.println("\nCities are:");
		System.out.println(A1);
		A1.removeAll(A1);
		System.out.println("\nAfter Removing:");
		System.out.println(A1);
	}
}
