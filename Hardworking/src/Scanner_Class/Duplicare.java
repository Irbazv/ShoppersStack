package Scanner_Class;

import java.util.Scanner;

public class Duplicare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[]arr=new int[size];
		for(int k=0;k<size;k++)
		{
			arr[k]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]=0;
					
				}
			}
		}
        for(int a1:arr)
        {
        	if(a1!=0) {
        	System.out.println(a1);}
        }
	}

}
