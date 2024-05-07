package Java_Logical_Programs;

public class Red1 {
	static void disp(int no)
	{
		
		if(no<=10)
		{
			int sum=0;
			if(no%2==0)
			{
				sum=sum+no;
				
			}
		
		System.out.println(sum);
		no++;
		disp(no);
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        disp(1);
	}

}
