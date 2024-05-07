package Hardworking;

public class Vowels {

	public static void main(String[] args) 
	{
		String s1= "Irbaz";
		for(int i= 0; i<s1.length(); i++)
		{
			char ch= s1.charAt(i);
			if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println(ch);
			}
		}

	}

}
