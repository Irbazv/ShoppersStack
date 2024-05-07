package Java_Logical_Programs;

public class Display3 {
	static void disp(int no)
	{
		int sum=0;
		if(no<=10)
		{
			if(no%2==1)
			{
				sum=sum+no;
				
			}
		
		System.out.println(sum);
		no++;
		disp(no);
		}
	
	}

	
	
	public static void main(String[] args) {
		
        disp(1);
	}

}
