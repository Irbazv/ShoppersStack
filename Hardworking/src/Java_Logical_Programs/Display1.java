package Java_Logical_Programs;

public class Display1 {
	static void disp(String[]arr,String[]abb)
	{
		int size=arr.length+abb.length;
		String[]acc=new String[size];
		int pos=0;
		for(String i:arr)
		{
			acc[pos]=i;
			pos++;
		}
		for(String j:abb)
		{
			acc[pos]=j;
			pos++;
			
		}
		for(String k:acc)
		{
			System.out.println(k);
		}
	}


	public static void main(String[] args)
	{
		String[]arr={"hi","hello","swap","swap"};
		String[]abb={"bye","come","gsno","goes"};
		disp(arr,abb);
		
		}
	

}


