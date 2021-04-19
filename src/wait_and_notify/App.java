package wait_and_notify;

public class App
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		RelayRacer rr = new RelayRacer();
		
		new Thread(() ->  rr.racerTwo()).start();
		
		new Thread(() ->  rr.racerOne()).start();
		
		

	}

}
