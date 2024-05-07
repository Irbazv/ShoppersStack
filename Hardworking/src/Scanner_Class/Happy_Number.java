package Scanner_Class;

import java.util.Scanner;

public class Happy_Number {

	public static void main(String[] args) {
		Scanner  sc=new Scanner(System.in);
		int no=sc.nextInt();
		int sum=sc.nextInt();
		while(no>9)
		{
			
		while(no>0)
		{
			
		
			int d=no%10;
			sum=sum+(d*d);
			no=no/10;
		}
		no=sum;
		sum=0;
		}
		if(no==1)
		{
		System.out.println("it is a Happy Number");
		}
		else
		{
			System.out.println("it is not a Happy Number");
		}
		

	}

}
