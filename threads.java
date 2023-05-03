import java.util.*;
class square extends Thread
{
	int n;
	square(int n)
	{
		this.n=n;
	}
	public void run()
	{
		int sqr=n*n;
		System.out.println("square of"+n+"="+sqr);
		}
}
class cube extends Thread
{
	int n;
	cube(int n)
	{
		this.n=n;
	}
	public void run()
	{
		int cube=n*n*n;
		System.out.println("cube of"+n+"="+cube);
	}
}
class randomnumber extends Thread
{
	public void run()
	{

	Random rd=new Random();
	for(int i=0;i<10;i++)
	{
		int randomInteger=rd.nextInt(10);
		System.out.println("random integer generated:"+randomInteger);
		if(randomInteger % 2 ==0)
		{
		square s=new square(randomInteger);
		s.start();
		}
		else
		{
		cube c=new cube(randomInteger);
		c.start();
		}
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("error"+e);
		}
	}
	}
}
public class ass2setb3
{
	public static void main(String args[])
	{
		randomnumber n=new randomnumber();
		n.start();
	}
}


