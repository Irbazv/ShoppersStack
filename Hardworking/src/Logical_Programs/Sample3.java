package Logical_Programs;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;

public class Sample3 {


	public static void main(String[] args) {
		int[]arr={10,20,30,10,40,20};
		LinkedHashMap<Integer,Integer> l1=new LinkedHashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(!l1.containsKey(arr[i]));
			{
				l1.put(arr[i],1);		
				}
		

			{
				int x=l1.get(arr[i]);
				x++;
				l1.put(arr[i], x);
			}
		}
		for(java.util.Map.Entry<Integer, Integer> a1:l1.entrySet())
		{
			System.out.println(a1.getKey()+" "+a1.getValue());
		}
		

	}

}
