package Scanner_Class;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum=sc.nextInt();
		int copy=no;
		while(no!=0)
		{
			int rem=no%10;
			int fact=1;
			for(int i=rem;i>=1;i++)
			{
				fact=fact*i;
				
			}
			sum=sum+fact;
			no=no/10;
			
		}
		if(copy==sum)
		{
			System.out.println("It is a Strong No");
			
		}
		else
		{
			System.out.println("it is not a Stronng number");
		}
	}

}
