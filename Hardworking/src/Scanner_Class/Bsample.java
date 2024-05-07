package Scanner_Class;

import java.util.Scanner;

public class Bsample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean size=sc.nextBoolean();
		int[]arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			}
		for(int j=0;j<arr.length;j++)
		{
			System.out.println(arr[j]);
		}
	}

}
