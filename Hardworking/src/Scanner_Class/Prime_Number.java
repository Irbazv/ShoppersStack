package Scanner_Class;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int j=1;j<=100;j++)
		{
			int no=sc.nextInt();
			int count=sc.nextInt();
			for(int i=1;i<=no;i++)
			{
				if(no%i==0)
				{
					count++;
					
				}
			
			if(count==2)
			{
				System.out.println("it is a Prime Number");
			}
			else
			{
				System.out.println("It is not a Prinre Number");
			}
			}
		}
	}
}

		
				

	


