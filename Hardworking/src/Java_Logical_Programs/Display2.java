package Java_Logical_Programs;

public class Display2 {
	static void disp(String[]arr,String[]abb)
	{
		int size=arr.length+abb.length;
		String[]acc=new String[size];
		int pos=0;
		for(int i:arr)
		{
			acc[pos]=i;
			pos++;
		}
		for(int j:abb)
		{
			acc[pos]=j;
			pos++;
			
		}
		for(int k:acc)
		{
			return k;
		}
		
	}
	
	public static void main(String[] args) {
		String[]arr={"hi","hello","swap","swap"};
		String[]abb={"bye","come","gsno","goes"};
		System.out.println();
	
		

	}

}
