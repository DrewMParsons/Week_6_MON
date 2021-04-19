package atomicExample;

import java.util.Iterator;

public class CounterWIthoutAutomic extends Thread
{
	Integer count = 0;
	int a = 0;
	
	public void myCounter()
	{
		for(int i=0; i<=5;i++) {
			a = count++;
		}
		System.out.println("value of non atomic "+a +" "+Thread.currentThread().getName());
	}
	
	public void run() {
		myCounter();
	}

}
