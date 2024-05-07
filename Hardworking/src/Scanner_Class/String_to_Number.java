package Scanner_Class;

import java.util.Scanner;

public class String_to_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String a=s1.substring(3,7);
		String b=s1.substring(10);
		int c=Integer.parseInt(a);
		int d=Integer.parseInt(b);
		int e=c+d;
		System.out.println(e);

	}

}
