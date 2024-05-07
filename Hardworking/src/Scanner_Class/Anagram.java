package Scanner_Class;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		if(s1.length()==s2.length())
		{
			char[]arr=s1.toCharArray();
			char[]abb=s2.toCharArray();
			Arrays.sort(arr);
			Arrays.sort(abb);
			String s3=new String(arr);
			String s4=new String(abb);
			if(s3.equals(s4))
			{
				System.out.println("It is a String Anagram");
				
			}
			else {
				System.out.println("It is not a String Anagram");
			}
			
		}

	}

}
