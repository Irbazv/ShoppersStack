package Scanner_Class;

import java.util.Scanner;

public class Bubble_sort_Scanner_Class {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int[]arr=new int[size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int j=0;j<arr.length-1;j++)
	{
		
		for(int k=0;k<arr.length-1;k++)
		{
			if(arr[j]>arr[k])
			{
				int temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
			}
		}
	}
	for(int a=0;a<arr.length;a++)
	{
		System.out.println(arr[a]+" ");
	}
	

	}

}