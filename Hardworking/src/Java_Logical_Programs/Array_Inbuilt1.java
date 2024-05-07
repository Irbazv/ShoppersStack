package Java_Logical_Programs;

public class Array_Inbuilt1 {
	static int oreo(int[]abb,int len)
	{
		
		for(int a1:abb)
		{
			len++;		
		}
		return len;
	}

	public static void main(String[] args) {
		int[]arr= {10,20,30,40};
		int length=0;
		int x=oreo(arr,length);
		System.out.println(x);
	}

	}


