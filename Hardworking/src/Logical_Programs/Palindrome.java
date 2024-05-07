package Logical_Programs;

public class Palindrome {

	public static void main(String[] args) {
		String s1="mom";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("it is a String Palindrome");
		}
		else
		{
			System.out.println("it is not a String Palindrome");
		}
		

	}

}
