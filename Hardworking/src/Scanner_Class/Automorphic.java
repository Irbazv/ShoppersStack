package Scanner_Class;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int p=sc.nextInt();
		int d=sc.nextInt();  
		int k=no*no;
		while(no>p)
		{
			p=k%d;
			d=d*10;
			}
		if(p==no)
		{
			System.out.println("it is a Automorphic");
		}
		else {
			System.out.println("it is not a Automorphic");
		}
		

	}

}
