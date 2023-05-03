import java.util.*;
import java.io.*;
class ass1setb3
{
	public static void main(String args[])throws IOException
	{
		File f=new File("text.txt");
		Scanner sc=new Scanner(f);
		Hashtable<String,String>ht=new Hashtable<String,String>();
		for(int i=0;i<3;i++)
		{
			ht.put(sc.next(),sc.next());
		}
		System.out.println(ht);
	}
}
