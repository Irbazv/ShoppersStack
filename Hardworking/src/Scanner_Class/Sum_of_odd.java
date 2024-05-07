package Scanner_Class;

import java.util.Scanner;

public class Sum_of_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
        int sum=sc.nextInt();
        while(no!=0)
        {
      	  int rem=no%10;
      	  if(rem%2==1)
      	  {
      		  sum=sum+rem;
      	  }
      	  no=no/10;
      	  
        }
        System.out.println(sum);

	}

}
