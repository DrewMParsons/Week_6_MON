package test_problem;

public class App
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String noSpace = String.format("%-20s%-20s", "four","five");
		String oneSpace = String.format("%-20s %-20s", "four","five");
		System.out.println("NO SPACES:"+ noSpace.length());
		System.out.println("ONE SPACE:"+ oneSpace.length());

	}

}
