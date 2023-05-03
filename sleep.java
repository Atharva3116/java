class MyThread extends Thread
{
	String name;
	MyThread(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{
			System.out.println("Reverse Sequence");
			for(int i=100;i>+1;i--)
			{
				System.out.println(i);
				Thread.sleep(6000);
			}
		}
		catch(InterruptedException ie)
		{}
	}
}
public class ass2seta2
{
	public static void main(String[] args)
	{
		MyThread t1=new MyThread("Reverse");
		System.out.println(t1);
		t1.start();
	}
}
