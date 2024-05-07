package Scanner_Class;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int fib1=sc.nextInt();
		int fib2=sc.nextInt();
		System.out.println(fib1+" "+fib2);
        for(int i=0;i<=10;i++)
        {
        	int fib3=fib1+fib2;
        	fib1=fib2;
        	fib2=fib3;
        	System.out.println(fib3);
        }
	}

}
