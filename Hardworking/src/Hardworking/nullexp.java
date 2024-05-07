package Hardworking;

public class nullexp {

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		
		nullexp n1=new nullexp();
		n1=null;
		
		try {
		System.out.println(n1.hashCode());
		}
		catch(NullPointerException e)
		{
			System.out.println("Handled");
		}
		

		
		System.out.println("main ends");

		// TODO Auto-generated method stub

	}

}
