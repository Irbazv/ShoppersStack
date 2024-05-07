package Scanner_Class;

import java.util.Scanner;

public class Rotation_OF_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		int acc=rotate(arr,1);
		for (int i = 1; i <=acc; i++) {
			int temp=arr[i];
			}
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=arr[j+1];
		}
		arr[arr.length-1]=acc;
	
	
	return;

}

	private static int rotate(int[] arr, int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
