package Java_Logical_Programs;

import java.util.Scanner;

public class Bubble_sort_Scanner_Class {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[]arr=new int[n];
	for(int j=0;j<n-1;j++)
	{
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		System.out.println(arr[k]+" ");
	}
	

	}

}
