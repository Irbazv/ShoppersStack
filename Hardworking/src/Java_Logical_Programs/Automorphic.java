package Java_Logical_Programs;

public class Automorphic {
	static void disp(int no,int p)
	{
		int d=10;
		int k=no*no;
		while(no>p)
		{
			p=k%d;
			d=d*10;
		}
		if(p==no)
		{
			System.out.println("it is a Automorphic number");
		}
		else {
			System.out.println("it is not a Automorphic number");
		}
	}

	public static void main(String[] args) {
		int a=5;
		int b=0;
		disp(a,b);

	}

}
