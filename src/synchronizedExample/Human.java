package synchronizedExample;

public class Human implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		//printNumber();
		try
		{
			printNumberSynchInWhile();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//whole method  block is synched
	public synchronized void printNumber() {
		System.out.println(Thread.currentThread().getName()+ " is  printing number");
		int counter = 0;
		while(counter < 5) {
			System.out.println(Thread.currentThread().getName()+" before: "+counter);
			counter++;
			System.out.println(Thread.currentThread().getName()+" after: "+counter);
			
		}
		System.out.println(Thread.currentThread().getName()+ " is  DONE");
	}
	// synch in while  block
	public  void printNumberSynchInWhile() throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ " is  printing number");
		int counter = 0;
		while(counter < 5) {
			synchronized(this) {
			System.out.println(Thread.currentThread().getName()+" before: "+counter);
			counter++;
			System.out.println(Thread.currentThread().getName()+" after: "+counter);
			Thread.sleep(1000);
			}
		}
		System.out.println(Thread.currentThread().getName()+ " is  DONE");
	}

}
