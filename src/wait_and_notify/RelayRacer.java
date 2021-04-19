package wait_and_notify;

public class RelayRacer
{
	public synchronized void  racerOne() {
		System.out.println("Race started");
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Runing--------->pass flag to 2nd partner");
		notify();
		
	}
	
	
	public synchronized void  racerTwo() {
		
		System.out.println("Waiting for partner to pass Flag");
		try
		{
			wait();
			System.out.println("Started running");
			System.out.println("Either win or lose");
		
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
