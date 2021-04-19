package synchronizedExample;

public class App
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Human h = new Human();
		Thread t1 = new Thread(h);
		Thread t2 = new Thread(h);
		
		t1.start();
		t2.start();
		

	}

}
