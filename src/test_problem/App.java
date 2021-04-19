package test_problem;

public class App
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		String noSpace = String.format("%-20s%-20s", "four","five");
		String oneSpace = String.format("%-20s %-20s", "four","five");
		System.out.println("NO SPACES:"+ noSpace.length());
		System.out.println("ONE SPACE:"+ oneSpace.length());
		
		Runnable thread2 = () ->{System.out.println("running: thread 2 ");};
		new Thread(thread2,"new thread").start();
		Thread t2 = new Thread(thread2,"new thread 2");
		t2.start();
		t2.join(1000);
		System.out.println(t2.getState());
		RunnableForDemo r1 = new RunnableForDemo();
		Thread thread3 = new Thread(r1);
		thread3.start();
		System.out.println(thread3.getName());
		System.out.println(Thread.currentThread().getName());
		try
		{
			System.out.println(thread3.getName() +  " is going to sleep");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try
//		{
//			System.out.println("Thread3 is waiting");
//			//thread3.wait();
//			System.out.println(thread3.getState());
//		} catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//Thread.currentThread().notifyAll();
		//t2.notify();
		System.out.println(thread3.getState());
		
		           
		

	}

}
