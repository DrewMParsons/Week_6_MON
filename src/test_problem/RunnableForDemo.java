package test_problem;

public class RunnableForDemo implements Runnable
{

	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		System.out.println("running this thread" );
		for(int i =0;i<200;i++) {
			System.out.println(i);
		}
		
	}

}
