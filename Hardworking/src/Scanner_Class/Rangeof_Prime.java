package Scanner_Class;

import java.util.Scanner;

public class Rangeof_Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Start=sc.nextInt();
		int end=sc.nextInt();
		for(int j=Start;j<=end;j++)
		{
			int no=j;
			int count=0;
			for(int i=0;j<=no;i++)
			if(no%i==0)
				{
					count++;
					
				}
			}
			if(count==2)
			{
				System.out.println("in is a Prime Number");
				
			}
			else {
				System.out.println("it is not a prime");
			}
		}
	}


