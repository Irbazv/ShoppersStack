package Scanner_Class;

import java.util.Scanner;

public class Sreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String[]arr=s1.split(" ");             
		for(int i=arr.length;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
      
	}

}
