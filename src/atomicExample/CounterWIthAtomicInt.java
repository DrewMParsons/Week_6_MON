package atomicExample;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterWIthAtomicInt extends Thread
{
	AtomicInteger count = new AtomicInteger(0);
	//int a = 0;
	
	public void myCounter()
	{
		for(int i=0; i<=5;i++) {
			count.set(count.addAndGet(1));
		}
		System.out.println("value of atomic "+count+" "+Thread.currentThread().getName());
	}
	
	public void run() {
		myCounter();
	}

}
