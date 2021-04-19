package atomicExample;

import java.util.concurrent.atomic.AtomicInteger;

public class App
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int counter  = 5;
		AtomicInteger atomicCounter = new AtomicInteger(5);
		
		CounterWIthoutAutomic c = new CounterWIthoutAutomic();
		Thread first = new Thread(c,"First");
		Thread second = new Thread(c,"Second");
		
		first.start();
		second.start();
		
		//call join on threads causes main thread  to wait until they are finished to continue with main
		
		try
		{
			first.join();
			second.join();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(c.count);
		
		CounterWIthAtomicInt d = new CounterWIthAtomicInt();
		
		Thread firstD = new Thread(d,"FirstD");
		Thread secondD = new Thread(d,"SecondD");
		
		firstD.start();
		secondD.start();
		
		try
		{
			firstD.join();
			secondD.join();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(d.count);
		
		
		
		
		
		

	}

}
