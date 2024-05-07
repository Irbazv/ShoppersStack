package Java_Logical_Programs;

public class Array_length1 {
	static int oreo(String s1)
	{
		char[]ch=s1.toCharArray();
		int length=0;
		for(char a1:ch)
		{
			length++;
		}
		return length  ;
	}

	public static void main(String[] args) {
		String a="java";
		int x=oreo(a);
		System.out.println(x);
	

		
		
	}

}
