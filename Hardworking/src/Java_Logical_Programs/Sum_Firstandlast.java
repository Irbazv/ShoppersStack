package Java_Logical_Programs;

public class Sum_Firstandlast {

	public static void main(String[] args) {
		int no=4321;
		int ld=0;
		int fd=0;
		ld=no%10;
		while(no>=10)
		{
			no=no/10;
			
		}
		fd=no;
		int sum=fd+ld;
		System.out.println(sum);

	}

}
