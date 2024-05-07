package com.family.myfamily;

public class Amazon {
	 static void submit()throws AmazonException
	   {
		   int amount=4000;
		   if(amount>=5000)
		   {
			   System.out.println("discount is applicable");
			   
		   }
		   else
		   {
			   throw new AmazonException("no discount");
			   
		   }
	   }

	public static void main(String[] args) 
	{
		try {
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
