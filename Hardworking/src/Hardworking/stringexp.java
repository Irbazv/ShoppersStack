package Hardworking;

public class stringexp {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		
		String a= "Amma";
		try
		{
			System.out.println(a.charAt(8));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Handled");
		}
		
		System.out.println("main ends");

	}

}
