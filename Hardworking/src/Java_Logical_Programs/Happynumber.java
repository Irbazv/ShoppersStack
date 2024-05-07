package Java_Logical_Programs;

public class Happynumber {
	static void disp(int no)
	{
		int sum=0;
		while(no>9)
		{
			int d=no%10;
			sum=sum+(d*d);
			no=no/10;
		}
		no=sum;
		 sum=0;
	
	
	
	


	if(no==1)
	{
		System.out.println("it is a happy no");
	}
	else
	{
		System.out.println("it is not a Happy Number");
	}
	
	}
	
	
	public static void main(String[] args) {
		int a=13;
		disp(a);
	

	}
}



