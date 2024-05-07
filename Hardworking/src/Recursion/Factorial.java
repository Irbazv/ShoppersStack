package Recursion;

public class Factorial {
	static int fact=1;
	static void disp(int no)
	{
		if(no>=1)
		{
			fact=fact*no;
			no--;
		}
	}
	

	public static void main(String[] args) {
	disp(5);
	System.out.println(fact);
		}
	
	
		
	

	}
