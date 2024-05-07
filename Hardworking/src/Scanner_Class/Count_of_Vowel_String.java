package Scanner_Class;

import java.util.Scanner;

public class Count_of_Vowel_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String[]arr=new String[size];
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u');
			{
				System.out.println(s1);
				
			}
		}
		

	}

}
