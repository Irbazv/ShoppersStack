package Hardworking;

public class finallycatchexp {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		try
		{
			int i =1/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled");
		}
		finally
		{
			System.out.println("im finally block");
		}
	
		
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}
