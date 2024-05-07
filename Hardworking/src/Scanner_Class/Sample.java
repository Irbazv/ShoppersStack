package Scanner_Class;

import java.util.Arrays;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int size=sc.nextInt();
		String[] arr=new String[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next();
			
		}
        
        	System.out.println(Arrays.toString(arr));
        }
	}


