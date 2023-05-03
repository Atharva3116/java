import java.io.*;
class MyThread extends Thread
{
	String message;
	int n;
	MyThread (String message,int n)
	{
		this.message = message;
		this.n=n; 
	}
	public void run() 
	{	
		try 
		{
			for(int i=1; i<=n; i++) 
			{
				System.out.println(message + "-" + i);
				Thread.sleep(500);  
			}
			
		}
		catch(InterruptedException ie)
		{
		}
	}	
}
public class ass2seta1
{
	public static void main( String[] args)
	{
		MyThread t1 = new MyThread("COVID19",10); 
		MyThread t2 = new MyThread("LOCKDOWN2020",20); 
		MyThread t3 = new MyThread("VACCINATION2021",30); 
		System.out.println(t1);
		t1.start();
		System.out.println(t2);
		t2.start();
		System.out.println(t3);
		t3.start();
	}
}
