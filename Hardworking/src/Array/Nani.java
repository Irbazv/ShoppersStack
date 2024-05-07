package Array;

public class Nani {
	
	static int Number(int Basket,int Red,int Green)
	{
		return(Green+Red)-Basket+1;
	}

	public static void main(String[] args) {
	
		int Basket=3;
		int Red=12;
		int Green=3;
		System.out.println("Maximum apple kept is = "+Number (Basket,Red,Green));

	}

}
