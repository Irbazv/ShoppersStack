package Hardworking;

public class finallyexp {

	public static void main(String[] args)
	{
		System.out.println("main starts");
		try
		{
		int i =1/0;
		}
		finally
		{
			System.out.println("im finally block");
		}
	
		
		System.out.println("main ends");
		
	}

}
