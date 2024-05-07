package Scanner_Class;

import java.util.Scanner;

public class Sum_first_last {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int fd=sc.nextInt();
		int ld=sc.nextInt();
		while(no>=10)
		{
			no=no/10;
		}
		fd=no;
		int sum=fd+ld;
		System.out.println(sum);

	}

}
