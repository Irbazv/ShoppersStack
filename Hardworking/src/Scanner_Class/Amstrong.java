package Scanner_Class;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int copy=no;
		int sum=sc.nextInt();
		while(no!=0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
			
		}
		if(copy==no)
        {
      	  System.out.println("It is a Amstrong Number");
        }
        else
        {
      	  System.out.println("It is not a Amstrong Number");
        }
	}

}
