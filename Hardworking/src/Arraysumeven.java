
public class Arraysumeven
{
	static void para(int[]abb)
	{
		int sum =0;
		for (int i = 0; i < abb.length; i++) 
		{
			if(abb[i]%2==0)
			{
				sum=sum+abb[i];
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args)
	{
		int[]arr= {2,3,4,5,8};
		para(arr);
		
	}

}
