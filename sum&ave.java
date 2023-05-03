import java.util.*;
public class ass2setb1 extends Thread
{
    int array[];
    int sum=0;
    public int getSum()
    {
        return sum;
       
    }
    public ass2setb1()
    {
        Random r=new Random();
        array=new int[100];
        for(int i=0;i<array.length;i++)array[i]=r.nextInt(1000);
       
    }
    public static void main(String[] args) throws InterruptedException
    {
        ass2setb1 t[]=new ass2setb1[10];
        int sum=0;
        for(int i=0;i<t.length;i++)
        {
            t[i]=new ass2setb1();
            t[i].start();
	    t[i].join();
            t[i].sleep(500);
            System.out.println("Thread Started:"+i);
           
        }
        for(int i=0;i<t.length;i++)
        {
            sum+=t[i].getSum();
           
        }
        System.out.println("Sum of 1000 integer is:\t"+sum);
        float f=sum/100;
        System.out.println("Avarage of 1000 integer is:\t"+f);
       
    }
    @Override
    public void run()
    {
        int i=0;
        while(i<array.length)
        {
            sum+=array[i];
            i++;
           
        }
       
    }
}

