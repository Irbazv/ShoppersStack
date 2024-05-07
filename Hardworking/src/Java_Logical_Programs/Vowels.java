package Java_Logical_Programs;

public class Vowels {
	static void tester(String[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			String s1=arr[i];
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
					{
				     System.out.println(s1);
					}
		}
	}

	public static void main(String[] args) {
		String[]abb={"apple","ball","elephant","Orange",};
		tester(abb);

	}

}
