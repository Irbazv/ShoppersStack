package Java_Logical_Programs;

public class Sum_firstandlast1 {
	static int oreo(int no)
	{
	int ld=0;
	int fd=0;
	ld=no%10;
	while(no>=10)
	{
		no=no/10;
		
	}
	fd=no;
	int sum=fd+ld;
	
	return sum;
	}

	public static void main(String[] args) {
		int a=4321;
		int x=oreo(a);
		System.out.println(x);
		
	}

}
