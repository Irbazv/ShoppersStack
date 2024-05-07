package Hardworking;

public class excepexp {

	public static void main(String[] args)
	{
		System.out.println("main starts");
		try
		{
			int i =1/0;
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		
		
		System.out.println("main ends");
		// TODO Auto-generated method stub

	}

}
