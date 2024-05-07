package Hardworking;

public class amazonexp 
{
	static void submit() throws AmazonException
	{
		int amt= 4000;
		if  (amt>=5000)
		{
			System.out.println("Offer");
		}
		else
		{
			throw new AmazonException(" Pantu illa chaddi illa");
		}
	}
	public static void main(String[] args) 
	{
		try 
		{
			submit();
		}
		catch(AmazonException e)
		{
			System.out.println(e.get());
		}
	}
}

class AmazonException extends Exception
{
	String msg;
	AmazonException(String msg)
	{
		this.msg=msg;
	}
	public String get()
	{
		return msg;
	}
}
