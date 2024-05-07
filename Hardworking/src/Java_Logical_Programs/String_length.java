package Java_Logical_Programs;

public class String_length {
	static void oreo(String s1)
	{
		char[] ch=s1.toCharArray();
		int length=0;
		for(char a1:ch)
		{
			length++;
		}
		System.out.println(length);
	}

	public static void main(String[] args) {
		String a="java";
		oreo(a);

	}

}
