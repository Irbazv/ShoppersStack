package Scanner_Class;

import java.util.Scanner;

public class Without_Third_Variable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		s1=s1+s2;
		s2=s1.substring(0,5);
		s1=s1.substring(5);
		System.out.println(s2);
		System.out.println(s1);

	}

}
